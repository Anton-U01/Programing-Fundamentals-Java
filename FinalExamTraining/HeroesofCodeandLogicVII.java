package FinalExamTraining;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesofCodeandLogicVII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Integer> hpMap = new HashMap<>();
        Map<String, Integer> manaMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String[] data = scan.nextLine().split(" ");
            String name = data[0];
            int hp = Integer.parseInt(data[1]);
            int mp = Integer.parseInt(data[2]);
            hpMap.put(name,hp);
            manaMap.put(name,mp);
        }
        String input = scan.nextLine();
        while (!input.equals("End")){
            String[] data = input.split(" - ");
            String command = data[0];
            String name = data[1];
            int amount = Integer.parseInt(data[2]);
            switch (command){
                case "CastSpell":
                    int neededMana = Integer.parseInt(data[2]);
                    String spellName = data[3];
                    if(manaMap.get(name) >= neededMana){
                        manaMap.put(name,manaMap.get(name) - neededMana);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",name,spellName,manaMap.get(name));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n",name,spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];
                    hpMap.put(name,hpMap.get(name) - damage);
                    if(hpMap.get(name) > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",name,damage,attacker,hpMap.get(name));
                    } else {
                        System.out.printf("%s has been killed by %s!%n",name,attacker);
                        hpMap.remove(name);
                        manaMap.remove(name);
                    }
                    break;
                case "Recharge":
                    if(manaMap.get(name) + amount > 200){
                        System.out.printf("%s recharged for %d MP!%n",name,200 - manaMap.get(name));
                        manaMap.put(name,200);
                    } else {
                        manaMap.put(name,manaMap.get(name) + amount);
                        System.out.printf("%s recharged for %d MP!%n",name,amount);
                    }
                    break;
                case "Heal":
                    if(hpMap.get(name) + amount > 100){
                        System.out.printf("%s healed for %d HP!%n",name,100 - hpMap.get(name));
                        hpMap.put(name,100);
                    } else {
                        hpMap.put(name,hpMap.get(name) + amount);
                        System.out.printf("%s healed for %d HP!%n",name,amount);
                    }
                    break;
            }

            input = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : hpMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue());
            System.out.println("  MP: " + manaMap.get(entry.getKey()));
        }
    }
}
