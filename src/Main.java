import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Title
        System.out.println("**************************");
        System.out.println("Welcome to Man Vs. Dragons");
        System.out.println("**************************");

        // Fire screen
        System.out.println();
        String victory = "                                                                     \n" +
                "            88                                                       \n" +
                "            \"\"              ,d                                       \n" +
                "                            88                                       \n" +
                "8b       d8 88  ,adPPYba, MM88MMM ,adPPYba,  8b,dPPYba, 8b       d8  \n" +
                "`8b     d8' 88 a8\"     \"\"   88   a8\"     \"8a 88P'   \"Y8 `8b     d8'  \n" +
                " `8b   d8'  88 8b           88   8b       d8 88          `8b   d8'   \n" +
                "  `8b,d8'   88 \"8a,   ,aa   88,  \"8a,   ,a8\" 88           `8b,d8'    \n" +
                "    \"8\"     88  `\"Ybbd8\"'   \"Y888 `\"YbbdP\"'  88             Y88'     \n" +
                "                                                            d8'      \n" +
                "                                                           d8'  ";
        String death = "                  _  /)\n" +
                "                 mo / )\n" +
                "                 |/)\\)\n" +
                "                  /\\_\n" +
                "                  \\__|=\n" +
                "                 (    )\n" +
                "                 __)(__\n" +
                "           _____/      \\\\_____\n" +
                "          |  _     ___   _   ||\n" +
                "          | | \\     |   | \\  ||\n" +
                "          | |  |    |   |  | ||\n" +
                "          | |_/     |   |_/  ||\n" +
                "          | | \\     |   |    ||\n" +
                "          | |  \\    |   |    ||\n" +
                "          | |   \\. _|_. | .  ||\n" +
                "          |                  ||\n" +
                "          |                  ||\n" +
                "          |                  ||\n" +
                "  *       | *   **    * **   |**      **\n" +
                "   \\))ejm97/.,(//,,..,,\\||(,,.,\\\\,.((//\n";
        String firescreen = "                        /\\\n" +
                "                        ||\n" +
                "                        ||\n" +
                "                        ||\n" +
                "                        ||                                               ~-----~\n" +
                "                        ||                                            /===--  ---~~~\n" +
                "                        ||                   ;'                 /==~- --   -    ---~~~\n" +
                "                        ||                (/ ('              /=----         ~~_  --(  '\n" +
                "                        ||             ' / ;'             /=----               \\__~\n" +
                "     '                ~==_=~          '('             ~-~~      ~~~~        ~~~--\\~'\n" +
                "     \\\\                (c_\\_        .i.             /~--    ~~~--   -~     (     '\n" +
                "      `\\               (}| /       / : \\           / ~~------~     ~~\\   (\n" +
                "      \\ '               ||/ \\      |===|          /~/             ~~~ \\ \\(\n" +
                "      ``~\\              ~~\\  )~.~_ >._.< _~-~     |`_          ~~-~     )\\\n" +
                "       '-~                 {  /  ) \\___/ (   \\   |` ` _       ~~         '\n" +
                "       \\ -~\\                -<__/  -   -  L~ -;   \\\\    \\ _ _/\n" +
                "       `` ~~=\\                  {    :    }\\ ,\\    ||   _ :(\n" +
                "        \\  ~~=\\__                \\ _/ \\_ /  )  } _//   ( `|'\n" +
                "        ``    , ~\\--~=\\           \\     /  / _/ / '    (   '\n" +
                "         \\`    } ~ ~~ -~=\\   _~_  / \\ / \\ )^ ( // :_  / '\n" +
                "         |    ,          _~-'   '~~__-_  / - |/     \\ (\n" +
                "          \\  ,_--_     _/              \\_'---', -~ .   \\\n" +
                "           )/      /\\ / /\\   ,~,         \\__ _}     \\_  \"~_\n" +
                "           ,      { ( _ )'} ~ - \\_    ~\\  (-:-)       \"\\   ~ \n" +
                "                  /'' ''  )~ \\~_ ~\\   )->  \\ :|    _,       \" \n" +
                "                 (\\  _/)''} | \\~_ ~  /~(   | :)   /          }\n" +
                "                <``  >;,,/  )= \\~__ {{{ '  \\ =(  ,   ,       ;\n" +
                "               {o_o }_/     |v  '~__  _    )-v|  \"  :       ,\"\n" +
                "               {/\"\\_)       {_/'  \\~__ ~\\_ \\\\_} '  {        /~\\\n" +
                "               ,/!          '_/    '~__ _-~ \\_' :  '      ,\"  ~ \n" +
                "              (''`                  /,'~___~    | /     ,\"  \\ ~' \n" +
                "             '/, )                 (-)  '~____~\";     ,\"     , }\n" +
                "           /,')                    / \\         /  ,~-\"       '~'\n" +
                "       (  ''/                     / ( '       /  /          '~'\n" +
                "    ~ ~  ,, /) ,                 (/( \\)      ( -)          /~'\n" +
                "  (  ~~ )`  ~}                   '  \\)'     _/ /           ~'\n" +
                " { |) /`,--.(  }'                    '     (  /          /~'\n" +
                "(` ~ ( c|~~| `}   )                        '/:\\         ,'\n" +
                " ~ )/``) )) '|),                          (/ | \\)                 -sjm\n" +
                "  (` (-~(( `~`'  )                        ' (/ '\n" +
                "   `~'    )'`')                              '\n" +
                "     ` ``";
        System.out.println(firescreen);
        System.out.println();

        // Grab user config data points
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hero Hit Points: ");
        int heroHP = scanner.nextInt();
        System.out.println("Enter Hero Damage points:  ");
        int heroDamage    = scanner.nextInt();



        // Setup for Dragons
        int dragon1HP = 100;
        int dragon1Damage = 20;
        int dragon2HP = 100;
        int dragon2Damage = 20;
        int dragon3HP = 100;
        int dragon3Damage =20;



        // Start the battle until all dragons dead or hero is dead
        boolean heroWins = false;
        while(true) {

            System.out.println("Hero has  " + heroHP + " HP and deals " + heroDamage + " points of damage.");
            System.out.println();

            System.out.println("Dragon Status");
            System.out.println("-------------");
            System.out.println("Dragon 1 has " + dragon1HP + " HP and deals " + dragon1Damage + " points of damage");
            System.out.println("Dragon 2 has " + dragon2HP + " HP and deals " + dragon2Damage + " points of damage");
            System.out.println("Dragon 3 has " + dragon3HP + " HP and deals " + dragon3Damage + " points of damage");
            System.out.println();
            // when hero HP less than zero we have died
            if(heroHP < 1) {
                heroWins = false;
                break;
            }

            // when all dragons have less tgan zero HP we win
            if(dragon1HP < 1 && dragon2HP < 1 && dragon3HP <1) {
                heroWins = true;
                break;
            }

            // get user input on which dragon to attack
            int dragonChoice = 0;
            while(dragonChoice < 1 || dragonChoice > 3) {
                System.out.println("Hero's turn to attack. Which Dragon would you like to attack (1, 2, 3)?");
                dragonChoice = scanner.nextInt();
            }

            // Attack the dragons
            System.out.println("Attacking Dragon " + dragonChoice);

            if(dragonChoice == 1) {
                // if dragon is already dead tell user, but they lose a turn
                if(dragon1HP < 1) {
                    System.out.println("Dragon 1 is already dead!");
                } else {
                    int heroHitsForDmg = random.nextInt(heroDamage);

                    dragon1HP = dragon1HP - heroHitsForDmg;
                }

            } else if(dragonChoice == 2) {

                // if dragon is already dead tell user, but they lose a turn
                if(dragon2HP < 1) {
                    System.out.println("Dragon 2 is already dead!");
                } else {
                    int heroHitsForDmg = random.nextInt(heroDamage);

                    dragon2HP = dragon2HP - heroHitsForDmg;
                }

            } else if(dragonChoice == 3) {

                // if dragon is already dead tell user, but they lose a turn
                if(dragon3HP < 1) {
                    System.out.println("Dragon 3 is already dead");

                } else {
                    int heroHitsForDmg = random.nextInt(heroDamage);

                    dragon3HP = dragon3HP - heroHitsForDmg;

                }
            }

            //Dragons attacks Hero
            if(dragon1HP > 0) {
                int dragonHitsForDmg = random.nextInt(dragon1Damage);
                heroHP = heroHP - dragonHitsForDmg;
            }

            if(dragon2HP > 0) {
                int dragonHitsForDmg = random.nextInt(dragon2Damage);
                heroHP = heroHP - dragonHitsForDmg;
            }

            if(dragon3HP > 0) {
                int dragonHitsForDmg = random.nextInt(dragon3Damage);
                heroHP = heroHP - dragonHitsForDmg;
            }


        }


        System.out.println("Battle Outcome");
        System.out.println("--------------");
        if(heroWins == false) {
            System.out.println(death);
            System.out.println("You were DEFEATED!");
        } else {
            System.out.println(victory);
            System.out.println("You are a true hero. You WIN!");
        }
    }
}