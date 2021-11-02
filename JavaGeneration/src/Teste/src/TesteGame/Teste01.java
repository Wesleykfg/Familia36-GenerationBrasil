package TesteGame;

import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int op = 0, op2 = 0;
		int opgame = 0, opgame2 = 0, opgame3 = 0, opgame4 = 0, opgame5 = 0, opgame6 = 0, opgame7 = 0, opgame8 = 0;
		String nome;
		
		System.out.println("                                                              ___              \r\n"
				+ "  .'|=|`.     .'|   .'|=|`.     .'|\\/|`.     .'|=|`.     .'| |   |   .'|=|`.   \r\n"
				+ ".'  | |  `. .'  | .'  | |  `. .'  |  |  `. .'  | |  `. .'  |\\|   | .'  | |  `. \r\n"
				+ "|   | |   | |   | |   |=|   | |   |  |   | |   | |   | |   | |   | |   | |   | \r\n"
				+ "|   | |  .' |   | |   | |   | |   |  |   | `.  | |  .' |   | |  .' |   | |  .' \r\n"
				+ "|___|=|.'   |___| |___| |___| |___|  |___|   `.|=|.'   |___| |.'   |___|=|.'   \r\n"
				+ "                                                                               ");
		
		System.out.println("             ___         ___   ___  ___  ___   ___ \r\n"
				+ "  .'|=|`.   |   | |`.   |   |=|_.' `._|=|   |=|_.' \r\n"
				+ ".'  | |  `. |   | |  `. `.  |           |   |      \r\n"
				+ "|   | |   | |   | |   |   `.|=|`.       |   |      \r\n"
				+ "|   | |  .' `.  | |   |  ___  |  `.     `.  |      \r\n"
				+ "|___|=|.'     `.|=|___|  `._|=|___|       `.|      \r\n"
				+ "                                                   ");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("\t\t\t***Seja bem vinde***"
				+"\nVocê está entrando no mundo da Família 36, esse lindo planeta bem distante"
				+ "\nde onde você vem. Aqui, todos falam javanez e vivem em harmonia nesse mundo magico."
				+ "\nDiante de tantas maravilhas, uma lenda ecoa pelos ouvidos dos seres: "
				+ "\n'Dentro da caverna mais escura, nas profundezas do surto, lá está esperando..."
				+ "\nA mais poderosa e bela das espadas, a DIAMOND DUST!!!'");
		System.out.println("                                                %%%%%\r\n"
				+ "                                                --=%%\r\n"
				+ "                                              --=-=%%\r\n"
				+ "                                             ==--*   \r\n"
				+ "                                           ===-+#    \r\n"
				+ "                                         ===--#      \r\n"
				+ "                                        =---*#       \r\n"
				+ "                                      ==--=#         \r\n"
				+ "                                     =---*           \r\n"
				+ "                                   +=--+*            \r\n"
				+ "                                 +=--=*              \r\n"
				+ "                                +---+                \r\n"
				+ "            ####              *=--=+                 \r\n"
				+ "          %#+**#            *+--=+                   \r\n"
				+ "          #**#             *---=                     \r\n"
				+ "       ###***%           *=--=+                      \r\n"
				+ "     %#+**####         #*--==                        \r\n"
				+ "     %#**     *#      #---=                          \r\n"
				+ "       #      %+#%  #+--==                           \r\n"
				+ "               *#%%#--==                             \r\n"
				+ "               %%%%#+==                              \r\n"
				+ "               %*++*%%%                              \r\n"
				+ "               %#***%%%%                             \r\n"
				+ "              #*#%%%%*+*#%       %                   \r\n"
				+ "            #**%      %%%*%     %+#%                 \r\n"
				+ "          #*+%           %##%%%*+*#%                 \r\n"
				+ "          +*%              %******#%                 \r\n"
				+ "         *%                %+**%%%                   \r\n"
				+ "       *#                  **#%                      \r\n"
				+ "     *#%                 ****#%                      \r\n"
				+ "  *#%%                   %%%%                        \r\n"
				+ " #+**%                                               \r\n"
				+ " %###                                                \r\n"
				+ " %%%%                                                ");
		System.out.println("\nA lenda diz que o escolhide pela espada podera derrotar o"
				+"\nterrivel mostro: Malevolus, o Spring..."
				+ "\nSerá você o escolhide?"
				+ "\nVocê será capaz de salvar nosso mundo das forças do Banco de Dados e Front End?"
				+ "\nBem, para isso, primeiro eu preciso que você se identifique:"
				+ "\nComo você prefere ser chamade?"
				+"\n1 - Masculino // 2 - Feminino // 3 - Gênero Neutro");
		op = leia.nextInt();
		while(op<0 || op>3) {
			System.out.println("\nComo você prefere ser chamade?"
					+"\n1 - Masculino // 2 - Feminino // 3 - Gênero Neutro");
			op = leia.nextInt();
		}
		
		switch (op)
		{
		case 1:
			System.out.println("                                                  \r\n"
					+ "        *                                         \r\n"
					+ "         *                                        \r\n"
					+ "         #                                        \r\n"
					+ "          #               -=                      \r\n"
					+ "           #             =++++                    \r\n"
					+ "           %            -+**+++=--                \r\n"
					+ "            #          =++*+++*+-+***=+           \r\n"
					+ "            %#         +**#*++#*=******           \r\n"
					+ "             %+      =+*#*++++*=*#*+*+*           \r\n"
					+ "             ##    *+**   *##*=+#+*#*+**          \r\n"
					+ "              ++=*++#     %#*##+#**+*+***         \r\n"
					+ "                         ##***#+#*#*++++*         \r\n"
					+ "                        #*****#***#**++***        \r\n"
					+ "                     -#**+**#*#*+*++#*#**+        \r\n"
					+ "                  *###*+***************#*++       \r\n"
					+ "                #*-*%*++*##*********##*##***      \r\n"
					+ "              ###+=****#%%%#**##*++#**#*##**      \r\n"
					+ "             *=     ##    ##*#%%  **%+#####*      \r\n"
					+ "                   +      *##%    =#%#  ####      \r\n"
					+ "                  ##      -        #%%            \r\n"
					+ "                 -+                   %-          \r\n"
					+ "                                       %#         \r\n"
					+ "                                        %#        \r\n"
					+ "                                                  ");
			
			System.out.println("\nEntendo, então jovem cavaleiro, como é o seu nome?");
			nome = leia.next();
			System.out.println("\nPois bem, "+nome+" sua aventura começa na frente da caverna mais escura do"
					+"\nmundo da Família 36... Você sente um vento gélido, suas pernas tremem,"
					+ "\nmas você retira forças e adentra aquele ambiente perigoso..."
					+ "\nAtravessando a caverna você nota pedras espalhadas pelo local, além de manchas"
					+"\nde sangue por toda parte, você engole em seco ao perceber o destino"
					+ "\ndos aspirantes anteriores."
					+ "\nCaminhando mais um pouco você vé uma luz, uma forte luz..."
					+"\nCorrendo em sua direção você percebe.");
			System.out.println("                                                         \r\n"
					+ "                                                         \r\n"
					+ "                           .:                            \r\n"
					+ "                           =-.                           \r\n"
					+ "                          -=::                           \r\n"
					+ "                       . :-::.                           \r\n"
					+ "                     -+-.:-::.:                          \r\n"
					+ "                    =*-:.:--=.:+:                        \r\n"
					+ "                    -*=:::-=#:-=*=                       \r\n"
					+ "                     :=*+=-=*+:=**                       \r\n"
					+ "                       .:+*++#-+*=                       \r\n"
					+ "                          .*-+=+-                        \r\n"
					+ "                           .:::                          \r\n"
					+ "                       .:#%%%%%-:                        \r\n"
					+ "                      -+-:-==+*##+                       \r\n"
					+ "                       .+==+**#%=                        \r\n"
					+ "                        :+++***+                         \r\n"
					+ "                         +++*##:                         \r\n"
					+ "                          +*#%:                          \r\n"
					+ "                          ++##                           \r\n"
					+ "                          -+#*                           \r\n"
					+ "                          -=#+                           \r\n"
					+ "                          :=#=                           \r\n"
					+ "                          .=#-                           \r\n"
					+ "                           =#:                           \r\n"
					+ "                           =#.                           \r\n"
					+ "                           =#                            \r\n"
					+ "                           -*                            \r\n"
					+ "                           -+                            \r\n"
					+ "                           -+                            \r\n"
					+ "                           -+                            \r\n"
					+ "                           -+                            \r\n"
					+ "                                                         \r\n"
					+ "                                                         \r\n"
					+ "");
			
			System.out.println("\nVocê se depara com uma tocha acesa, brilhando intensamente como"
					+"\no Sol na escuridão do espaço."
					+"\nApos acender a sua tocha você segue seu caminho. Agora com luz"
					+ "\nvocê pode reparar na caverna de uma forma mais detalhada!"
					+ "\nÉ possível notar as paredes acinzentadas e estranhamente simétricas,"
					+ "\no chão banhado pelo liquido da vida de antigos heróis parecia imponente,"
					+ "\ntudo naquele lugar gritava grandeza e perigo."
					+ "\nEm dado momento de sua caminhada, você nota que a caverna anteriormente linear"
					+ "\nagora apresentava dois caminhos para seguir... O que fará jovem herói?"
					+ "\n1 - Esquerda <--- // ---> 2 - Direita");
			opgame = leia.nextInt();
			while(opgame<=0 || opgame>2) {
				System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
				opgame = leia.nextInt();
			}
				if(opgame==1) {
				System.out.println("\nSeguindo pelo caminho da Esquerda, você se depara com uma incrivel floresta..."
						+ "\nMas como isso seria possível? Você está dentro de uma caverna..."
						+ "\nMas lá estava ela, bela e imponente, banhada pela luz do luar!"
						+ "\nEra possível ver os animais felizes, as águas cristalinas, tudo em perfeito estado."
						+ "\nNão muito distante, você pode ver as arvores em um balançar diferente..."
						+ "\nE sem qualquer aviso, um grande escorpião saltou das arvores e parou em sua frente."
						+ "\nA criatura era gigantesca e amedrontadora!!!");
				System.out.println("                     .                            \r\n"
						+ "                  .=++++:                         \r\n"
						+ "                 .+::--*#*-                       \r\n"
						+ "                 :+.:-*#***+.                     \r\n"
						+ "                 :*.:=++***#+                     \r\n"
						+ "                  ==:+.-*==*#=                    \r\n"
						+ "                  .-++ :+==**+                    \r\n"
						+ "                       :+==+*#.                   \r\n"
						+ "                       -=:-=*#:                   \r\n"
						+ "                       -+===+#*                   \r\n"
						+ "                     .-+-:-=##* ...               \r\n"
						+ "                 .-=+*%#*+*###*=+*+=.             \r\n"
						+ "               -=++=**=+++*##*##*-=++.            \r\n"
						+ "               +:--*++++*+**+##+=-=+#=.           \r\n"
						+ "              .*=+++#=-==+**#+%*+*#+*+:           \r\n"
						+ "             .+:-=+%+---=+###*#::-+=#.            \r\n"
						+ "            .*+==+#%++++++*#**#**=+-              \r\n"
						+ "            -*--=:*+=++******#*==**+              \r\n"
						+ "           .*++=*+*%+:=---=%#%*++**#=             \r\n"
						+ "           -*-.=+*###+::=-*####=-=+*#*            \r\n"
						+ "            :+=::-+*#*#**##++#-:-==+*#            \r\n"
						+ "            +:.::-=**#*#*#++*-..---+*#            \r\n"
						+ "           .*::::=*#*#*###***..:--+=*#-           \r\n"
						+ "           .*---+###%###+####:::=##++#=           \r\n"
						+ "            :+=+*#*##*+#%#*+#*-=*##*+*.           \r\n"
						+ "             .=##**+*###=:*#==*##*+=*.            \r\n"
						+ "              -=--=*=         =+==*+.             \r\n"
						+ "             .====-.        ..++++::...........   \r\n"
						+ ".        . .      . .      .::.::::::::.:::::::. .");
				
				System.out.println();
				System.out.println("\n- Eu me chamo Eclipse, sou o lendario escorpião rei!!!"
						+ "\nPara passar, você deve seguir a regra... Aqui, você precisa responder uma pergunta!"
						+ "\nQuado um programa é encerrado, os dados são salvos nas variaves? Restonda-me criatura inferior...");
				System.out.println();
				System.out.println("\nA voz do escorpião era alta, vibrante e agressiva..."
						+ "\nVocê não tinha para onde correr, ele o alcançaria rapidamente,"
						+ "\nalém disso você não acreditava possuir arma que penetrasse tal corpo..."
						+ "\nEntão jovem herói, o que irá fazer? O que irá responder?"
						+ "\n1 - Não grande Eclipse!"
						+ "\n2 - Não quero saber, eu vou passar!");
				
				opgame2 = leia.nextInt();
				while(opgame2<=0 || opgame2>2) {
					System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
					opgame2 = leia.nextInt();
				}
					if(opgame2==1) {
						System.out.println("\nMuito bem guerreiro, pode passar!");
						System.out.println("\nO grande escorpião abre espaço e finalmente você pode avançar!"
								+ "\nPassando pela floresta, você chega a um grande portão, que ao abrir,"
								+ "\nVocê se depara com uma grande sala, cheia de pastas, no centro,"
								+ "\nVocê pode ver um senhor organizando todas as pastas..."
								+ "\n- Parabéns jovem herói, falta pouco! Eu me chamo Rafael, o sábio do BACK END...");
						System.out.println("                                                      \r\n"
								+ "                                                      \r\n"
								+ "                                                      \r\n"
								+ "                                .:::.                 \r\n"
								+ "                           :=+*#******+*+==.          \r\n"
								+ "                         :#%%%%%%%######%###-         \r\n"
								+ "                        -++++*##%%%%#%#%%%%%#*:       \r\n"
								+ "                   .:-=++++**####%%%#+=----=*##-      \r\n"
								+ "               .:=*###%###****#*###%+       .*#+      \r\n"
								+ "           .-+*######%%%#%%%%%%####*+:       .##.     \r\n"
								+ "          :########%###***#%%%%%%####*+:      +#.     \r\n"
								+ "          :#%#####%##%%#=*#####%%%%%%%%#+.    :#:     \r\n"
								+ "           :#%%%%%##***--+=+++**#%%%%%%%%#-    #-     \r\n"
								+ "        :.  :%%%%%#*+==:==-:=+*++#%%%%%%%%%+   .*:    \r\n"
								+ "        ::   +%%%%*=+++=+==--=+*+**%%%%%%%%%*.  .+.   \r\n"
								+ "        ::.   .-*+===:-*=--.=:-+*****#%%%%%%%=    .   \r\n"
								+ "        :-:    :-===.:++==+::::=+***+++#%%%%%-        \r\n"
								+ "       .:--. .=++==:.:....::.:::=+=+#**+*#%#=         \r\n"
								+ "     .:---=-:-+*++:::.  ..:::::::===**##*#**+:        \r\n"
								+ "    .---====-:+**-:::.....::--:-:--=+********+-       \r\n"
								+ "    .=+====---**+:-::.....-:--::::-+***#**+*%#*-      \r\n"
								+ "     :--::-:-+##=-:::.....-:-:::::=*#***##++##*:      \r\n"
								+ "      :-::--=+*#*-:::.....-:-::::-+*%*++#%#*#***.     \r\n"
								+ "       -=--=##%*=:::.....:--::::-=++%%*#####****=     \r\n"
								+ "      .:--==#%%*=:::.....:--::-:-+****######*###+     \r\n"
								+ "     .----==*%%#+:::.....:::.--=++**:+##%######**.    \r\n"
								+ "     :-----=+#%#+::.....::..:-=*#***-=+*%####***#-    \r\n"
								+ "     =:----=*#%#*-:.....::.:-++#***#+-:-+#######*=    \r\n"
								+ "    :+--====*#%#*-:.....:.:-=*#**+=-:----=########.   \r\n"
								+ "    =++=====*#%#*-:.....::--+##**---------=**###**+   \r\n"
								+ "    *+#++==+#%%#*-::...:::-+##***==-:-------=+**##*.  \r\n"
								+ "    #*%#*+*%#%%##=::...::-+###**------------==***#*.  \r\n"
								+ "    #*%%%%%%#%%##+::..::--*##***+==-----==--==***##.  \r\n"
								+ "    #*%%%%%%#%%##*::..:-=-###*##*=+===*##+=-+=***##.  \r\n"
								+ "    +##%%%%%#%%##*::..-==+###+#########%%#*+*=**###   \r\n"
								+ "    .#*%%%%%#%###*::::-=*####*#########%%%#**=**##=   \r\n"
								+ "     -*%%%%##=+###-:::-+#####*#########%%%%%#=*###:   \r\n"
								+ "      =%%%%#* +*#*-::--*#####*#########%%%%%#+###*    \r\n"
								+ "      .+%%#*: ****-::-=*#####*#########%%%%%*+###-    \r\n"
								+ "       .+**-  ##**+::-+######+#########%%%%%+*###:    \r\n"
								+ "         .   :##+#*::=*######*########*%%%%%+####     \r\n"
								+ "             -##+##-:=########*#######*%%%%#+###=     \r\n"
								+ "             +##+##=:=########+######%*%%%%**###      \r\n"
								+ "             *##**##--########**######*%%%%*##%+      \r\n"
								+ "             +##**##+:+########+*#####*#%%#*#%%-      \r\n"
								+ "             +###+###+-*########+#####**%#*#%%#.      \r\n"
								+ "             =###*####*-*########+#####***#%%##       \r\n"
								+ "             -####*#####+*########*######%%%##+       \r\n"
								+ "             .##*#**###############*#####%%%%#*       \r\n"
								+ "              *####*################*#####%%%##       ");
						System.out.println("\n- Para passar você deve responder a mais um teste..."
								+ "\n- Complete a palavra: *o**m**"
								+ "\n1 - Mosaico"
								+ "\n2 - Postman"
								+ "\n3 - Gomamon");
						opgame4 = leia.nextInt();
						while(opgame4<=0 || opgame4>3) {
							System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
							opgame4 = leia.nextInt();
						}
						if(opgame4==1) {
							System.out.println("\n- É uma pena, mas seus conhecimentos não são o suficiente, quem sabe na próxima...");
							System.out.println("                                                             ,----..\r\n"
									+ "  ,----..                            ____                   /   /   \\\r\n"
									+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
									+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
									+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
									+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
									+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
									+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
									+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
									+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
									+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
									+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
									+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
									+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
									+ "");
						}
						
						if(opgame4==3) {
							System.out.println("\n- É uma pena, mas seus conhecimentos não são o suficiente, quem sabe na próxima...");
							System.out.println("                                                             ,----..\r\n"
									+ "  ,----..                            ____                   /   /   \\\r\n"
									+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
									+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
									+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
									+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
									+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
									+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
									+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
									+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
									+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
									+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
									+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
									+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
									+ "");
						}
						
						if(opgame4==2) {
							System.out.println("\n- Muito bem, jovem herói, você pode avançar agora, provou seu conhecimento!");
							System.out.println("\n Passando pelo sábio você atravessa um grande corredor e abre a porta no final do mesmo..."
									+ "você é recebido com uma poderosa luz e anjos cantando!"
									+ "\nVocê adentra uma grande sala dourada, brilhante e vazia..."
									+ "\nNa sala so tinha um altar, e nele...");
							System.out.println("                                                %%%%%\r\n"
									+ "                                                --=%%\r\n"
									+ "                                              --=-=%%\r\n"
									+ "                                             ==--*   \r\n"
									+ "                                           ===-+#    \r\n"
									+ "                                         ===--#      \r\n"
									+ "                                        =---*#       \r\n"
									+ "                                      ==--=#         \r\n"
									+ "                                     =---*           \r\n"
									+ "                                   +=--+*            \r\n"
									+ "                                 +=--=*              \r\n"
									+ "                                +---+                \r\n"
									+ "            ####              *=--=+                 \r\n"
									+ "          %#+**#            *+--=+                   \r\n"
									+ "          #**#             *---=                     \r\n"
									+ "       ###***%           *=--=+                      \r\n"
									+ "     %#+**####         #*--==                        \r\n"
									+ "     %#**     *#      #---=                          \r\n"
									+ "       #      %+#%  #+--==                           \r\n"
									+ "               *#%%#--==                             \r\n"
									+ "               %%%%#+==                              \r\n"
									+ "               %*++*%%%                              \r\n"
									+ "               %#***%%%%                             \r\n"
									+ "              #*#%%%%*+*#%       %                   \r\n"
									+ "            #**%      %%%*%     %+#%                 \r\n"
									+ "          #*+%           %##%%%*+*#%                 \r\n"
									+ "          +*%              %******#%                 \r\n"
									+ "         *%                %+**%%%                   \r\n"
									+ "       *#                  **#%                      \r\n"
									+ "     *#%                 ****#%                      \r\n"
									+ "  *#%%                   %%%%                        \r\n"
									+ " #+**%                                               \r\n"
									+ " %###                                                \r\n"
									+ " %%%%                                                ");
							System.out.println("\nFinalmente você conseguiu!!! Conquistou a espada lendaria!!!"
									+ "\nA Diamound Dust é sua! Mas lembre-se..."
									+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
									+ "\nPortanto, seu dever agora é usar da espada para proteger o mundo"
									+ "\nda Família 36!"
									+ "\nBoa sorte "+nome+" sua verdadeira batalha começa agora!"
									+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
									+ "\nOlhos vermelhos são vistos na escuridão, você sentia, ali estava ele, Malevolus, o Spring!");
							System.out.println("                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                         ::-*=                    \r\n"
									+ "                        -:.:=*                    \r\n"
									+ "                       =:..:=                     \r\n"
									+ "                      =-...:-+                    \r\n"
									+ "                     **++===+*                    \r\n"
									+ "                    +=---:--=*#                   \r\n"
									+ "                 :++++***+++=--=                  \r\n"
									+ "             .%%@@@@%+=#@@@#=*%%#*-               \r\n"
									+ "          #%@@@@@@@@#-.+%@%=.=%@@@@@#             \r\n"
									+ "          =++++%@@@@%=:+%@%=.=%@@@@@@@@#          \r\n"
									+ "        :-    *=%%%###*#%@%**#%@@@@@@             \r\n"
									+ "        *+     +  %%####%@%######                 \r\n"
									+ "         *.    =  ####%%%%%%##%                   \r\n"
									+ "          **   =++=+**#######**+                  \r\n"
									+ "                #+:.:-*####*+--=:                 \r\n"
									+ "               #+*+==-=+*#*+==+--                 \r\n"
									+ "               #*##**+=++*+=+=---=                \r\n"
									+ "              ##*###****+*=+-==-=+=               \r\n"
									+ "             =***%%####%#++-:-=++++               \r\n"
									+ "             =***%%%##**##+=---+*+*               \r\n"
									+ "            -=*+*%%%##++#**##****+**              \r\n"
									+ "            -=*+*%%#%#+*########***#              \r\n"
									+ "            -+*+#%#%%#+***#%###%*+*#              \r\n"
									+ "            =+++#%%##*=+*+*%%%%%*#++              \r\n"
									+ "            =+=+%%###+=+**+#%%%##**#+             \r\n"
									+ "            =+=*%#*##=-=+*++%#%%##+*              \r\n"
									+ "            ==+%%*+#*=-=+*+=+%#%#**=.             \r\n"
									+ "            ==*%#*+*+=-==*++=*%##++*+             \r\n"
									+ "            =+###++*+--==+*+==*%%*++*+            \r\n"
									+ "             *   ++*=--===*++=+#%%*+++*+-         \r\n"
									+ "                     --==-                        \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  ");
							System.out.println("\n- Vejo que chegou bem longe jovem, porém, tudo termina aqui...");
							System.out.println("\nA voz de Malevolus era ameaçadora, Coberto por seu manto, o mesmo"
									+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
									+ "\nO que você fará?"
									+ "\n1 - Desviar para a esquerda."
									+ "\n2 - Desviar para a diretia.");
							opgame5 = leia.nextInt();
							while(opgame5<=0 || opgame5>2) {
								System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
								opgame5 = leia.nextInt();
							}
							if(opgame5==2) {
								System.out.println("\n Escolhendo a direção errada, você é pego pela avalanche de classes, o poder da magia CRUD é grande...");
								System.out.println("                                                             ,----..\r\n"
										+ "  ,----..                            ____                   /   /   \\\r\n"
										+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
										+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
										+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
										+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
										+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
										+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
										+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
										+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
										+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
										+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
										+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
										+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
										+ "");
							}
							
							if(opgame5==1) {
								System.out.println("\n Você escolheu a direção certa, pulando para a esquerda e desviando facilmente!"
										+ "\nEntretanto, Malevolus não para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR POSTMAN E SPRING AO MESMO TEMPO"
										+ "\nE agora jovem herói, como irá escapar dessa?"
										+ "\n1 - Desviar para a esquerda."
										+ "\n2 - Desviar para a diretia.");
								opgame6 = leia.nextInt();
								while(opgame6<=0 || opgame6>2) {
									System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
									opgame6 = leia.nextInt();
								}
								if(opgame6==1) {
									System.out.println("\n Escolhendo a esquerda errada, você é pego pelo travamento infinito e fica para sempre congelado...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								if(opgame6==2) {
									System.out.println("\nVocê consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperança..."
											+ "\nÉ agora, essa é sua ultima chance de derrotar o poderoso Spring, o que fará?"
											+ "\n1 - Usar a espada!"
											+ "\n2 - Desviar para a esquerda!");
								}
								opgame7 = leia.nextInt();
								while(opgame7<=0 || opgame7>2) {
									System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
									opgame7 = leia.nextInt();
								}
								if(opgame7==2) {
									System.out.println("\n Apesar de sua velocidade, a magia de Malevolus o atinge o fazendo entrar em desespero...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								if(opgame7==1) {
									System.out.println("\nCom um movimento forte, você rebate a magia do poderoso Spring o atingindo!"
											+ "\n- Como? Como isso é possível?"
											+ "\nCom um sorriso no rosto, você assiste ao desaparecimento de Malevolus para sempre..."
											+ "\nCom seu dever cumprido, você se retira da caverna sorrindo, olhando o belo por do Sol..."
											+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
											+ "\n'Confie no processo...'"
											+ "\nParabéns "+nome+" você salvou o mundo do desespero e desesperança, todos os habitantes sempre"
											+ "\nirão lembrar do grande herói que um dia os salvou!"
											+ "\nO mundo da Família 36 descansa em uma era de paz mais uma vez!!!");
									System.out.println(" _______  __  .___  ___. \r\n"
											+ "|   ____||  | |   \\/   | \r\n"
											+ "|  |__   |  | |  \\  /  | \r\n"
											+ "|   __|  |  | |  |\\/|  | \r\n"
											+ "|  |     |  | |  |  |  | \r\n"
											+ "|__|     |__| |__|  |__| \r\n"
											+ "                         ");
								}
								
							}
							
						}
						
					}
					if(opgame2==2) {
						System.out.println("\n- Homem insolente!! Nunca deve-se ir contra as regras!!!"
								+ "\nEm um unico movimento com a calda, o escorpião ataca com toda sua furia...");
						System.out.println("                                                             ,----..\r\n"
								+ "  ,----..                            ____                   /   /   \\\r\n"
								+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
								+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
								+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
								+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
								+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
								+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
								+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
								+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
								+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
								+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
								+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
								+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
								+ "");
					}
				}
					
					
				if(opgame==2) {
					System.out.println("\nDecidindo pela Direita, você segue seu caminho arduamente"
							+ "\naté chegar a uma grande biblioteca, lotada de todos os livros possíveis."
							+ "\nAdentrando o local você percebe um senhor, olhando fixamente para você,"
							+ "\nEle vestia um manto e chapéu, alem de segurar um cajado."
							+ "\nA seu lado, uma senhora com a mesma vestimenta distraida com a imagem"
							+ "\nde uma criança em um livro.");
					
					System.out.println("                                                  \r\n"
							+ "                                                  \r\n"
							+ "                                                  \r\n"
							+ "                                                  \r\n"
							+ "                                                  \r\n"
							+ "                                                  \r\n"
							+ "                                                  \r\n"
							+ "                                                  \r\n"
							+ "                                                  \r\n"
							+ "                                                  \r\n"
							+ "                        *#                        \r\n"
							+ "                       %+%                        \r\n"
							+ "        --             +*                         \r\n"
							+ "        =:             =+-                        \r\n"
							+ "      ==               ==%%  @%%=                 \r\n"
							+ "    .===    :-         +=#%#%%%@%#                \r\n"
							+ "        -+  --         *=+#%%@@%##%+              \r\n"
							+ "         #++*          %%##%@@%*##%%#%#         # \r\n"
							+ "         +  +-         %@%*%%%###%@@%#***      %%@\r\n"
							+ "             +=+       %#**#*###%@@%#*%@@@@@%%%%%@\r\n"
							+ "                        ++*##*+*%%@%##@@##%%@%##% \r\n"
							+ "                        %%@%=-=:-=+#%%@@%%*#%@%   \r\n"
							+ "                       %@@#=%%-.:-=+*@@@@%###%%   \r\n"
							+ "                    # #%%@@@@@#:.::=%@%%@@*#%%%*  \r\n"
							+ "                     %#*#@%.  ##-::::*%%#@#%+=#@  \r\n"
							+ "                     ==+%@#    #%*....#@%#@%+*### \r\n"
							+ "                       -=#%     #@#=..:*@@@@@@%*# \r\n"
							+ "                          .*     -%@%+--=#@@@@%@  \r\n"
							+ "                            -      %@%@%*-==%%%   \r\n"
							+ "                             :      @%@@@@@%@@%   \r\n"
							+ "                              *     %%%           \r\n"
							+ "                                     %            \r\n"
							+ "                                                  \r\n"
							+ "                                                  ");
					
					System.out.println("                                                    \r\n"
							+ "                   .:                               \r\n"
							+ "               .=:+=+-                              \r\n"
							+ "               *:=.:=+:                             \r\n"
							+ "              -+::-*+*=                             \r\n"
							+ "          .==-+:.=*= .:==.                          \r\n"
							+ "           -==-.:**-++*-+-:                         \r\n"
							+ "     ...    .*=.:=+=-::::-++=.                      \r\n"
							+ "     +#*+    =+::.=+===+-.-=+:                      \r\n"
							+ "     +**+%   :+-.:.-**=+-.-=#=:                     \r\n"
							+ "    .****%  .*=+-:----=-:..:=++:                    \r\n"
							+ "  .=*****: .==:-+=:--=::--:*==-::.                  \r\n"
							+ " :*****%:.=..++--:::-:::.=+*@%%##**.                \r\n"
							+ ".%+*#%%##%+*- +-::%%#*+++=*+@####+%%=               \r\n"
							+ ".+++- =##+**--==+%%%#####%%%####=+-=%#:     -       \r\n"
							+ "      +**#%*:..:+=##*=-:-:-=#%#*=+###%#+.  ##*:     \r\n"
							+ "      +#*-%+***=:==#*#*=::-#**#+-=#=*##%#**###*.    \r\n"
							+ "         .%**#%*-==#%#*##-.:+#****+#%###%%%%%##+    \r\n"
							+ "          .++*%+=:+- :=*#%+.:=+*+*+*+#%########-    \r\n"
							+ "              =#**-    ..++%*-.+#*****%%%%%%%+.     \r\n"
							+ "               .+**+.     :-**+--*#**###%%+::       \r\n"
							+ "                 -***-      .+#**-##%++**##+++=.    \r\n"
							+ "                  .+***:    :#*##%#+###*******##*:  \r\n"
							+ "                    :**#+.  :%%##*%++#%%%%%%#####%- \r\n"
							+ "                     .-*##   -*####%+*%%%%%%%####%- \r\n"
							+ "                       .::    .::::##*#%%%-:::::::. \r\n"
							+ "                                    %**%%%:         \r\n"
							+ "                                    %**##%:         \r\n"
							+ "                                    :%###%:         \r\n"
							+ "                                     -###%:         \r\n"
							+ "                                      .---.         \r\n"
							+ "                                                    ");
					
					System.out.println("\n- Já sei o que veio buscar, jovem viajante, Eu me chamo Luis."
							+ "\nSou o sábio do JAVA.");
					System.out.println("\nA voz do senhor era potente, poderia ecoar por todo planeta.");
					System.out.println("\n- Eu me chamo Jéssica, mas pode me chamar de Tia Jess, a sábia do FRONT END.");
					System.out.println("\nA senhora se apresenta, finamente notando sua presença.");
					System.out.println("\n- Para conseguir a espada você só precisa responder a uma pergunta...");
					System.out.println("\nO senhor comentava de forma sorridente, erá visivel que ele gostava"
							+ "\nde suas perguntas!");
					System.out.println("- Um passarinho caiu do ninho de uma arvore..."
							+ "\nComo uma forma de sobreviver, o mesmo começo a bater as asinhas para tentar voar..."
							+ "\nPorem, o passarinho nunca havia voado antes..."
							+ "\nEle irá conseguir?"
							+ "\n1 - VAI DAR BOM!!!"
							+ "\n2 - Acho que não...");
					opgame3 = leia.nextInt();
					while(opgame3<=0 || opgame3>2) {
						System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
						opgame3 = leia.nextInt();
					}
						if(opgame3==1) {
							System.out.println("\nMuito bem guerreiro, pode passar!");
							System.out.println("\nOs dois sábios abrem espaço e finalmente você pode avançar!"
									+ "\nPassando pela biblioteca, você chega a um grande portão, que ao abrir,"
									+ "\nVocê adentra a um teatro, completamente cheio de monitores."
									+ "\nNo palco, você observa um livro murmurando...");
							System.out.println("Gerar arte ASCII\r\n"
									+ "Dowloadcópia de\r\n"
									+ "                                     ....            \r\n"
									+ "                                  .......            \r\n"
									+ "     :.....                     ..........           \r\n"
									+ "     ..... .....             ..............          \r\n"
									+ "  .::-.....     ....      ... ............:          \r\n"
									+ " .:===:....         .. ...    .............:         \r\n"
									+ " ::-==-....           :      ................        \r\n"
									+ " :::===.....          :     ..................       \r\n"
									+ "+=::==-:....           :    .................:       \r\n"
									+ "+*::-=--....           :   ....................      \r\n"
									+ "-#-::=-=....            : ......................     \r\n"
									+ ".#=::---:...            : .....................:     \r\n"
									+ " #+::----....            :.......................    \r\n"
									+ " +#-::---....            :....................:::    \r\n"
									+ " -#=::---:...            .:.................::. =    \r\n"
									+ " .#+::---:....            :..............::.    .-   \r\n"
									+ "  **-::---::..            .:..........::.        ::  \r\n"
									+ "  =#=::----:::-:::....     :........:..           -. \r\n"
									+ "  :#+::-----------:::::.....:....:..    ......:::::= \r\n"
									+ "   #*::-:::::::::::::::--::::.:::::::::-:::::::::::--\r\n"
									+ "   +*=-:::::::--==++++**+*+++=-:::::::::--==+++====--\r\n"
									+ "   -#+-::-==+*****##*++=-:.-##==+++=====-::.         \r\n"
									+ "   .#*=+*##**+=--:.         .--:                     \r\n"
									+ "    #*+=-:                                           ");
							System.out.println("\n- Seja bem vindo ao teste final, herói... Meu nome é Documentação, a boa pratica..."
									+ "\n- Meu questionamento é simples..."
									+ "\nA voz do livro era calma, quase sem emoção."
									+ "\n- Os primeiros sistemas possuiam documentação?"
									+ "\n1 - Sim."
									+ "\n2 - Não.");
							opgame8 = leia.nextInt();
							while(opgame8<=0 || opgame8>2) {
								System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
								opgame3 = leia.nextInt();
							}
							if(opgame8==1) {
								System.out.println("\n- Claro... Você está errado..."
										+ "\nO livro sem emoção brilha intensamente apos seu decreto e"
										+ "\ndemonstrando todo seu poder, o mesmo cresce..."
										+ "\nAgora, tão grande quando o teatro, em um unico movimento ele engole"
										+ "\nvocê de forma abrupta!");
								System.out.println("                                                             ,----..\r\n"
										+ "  ,----..                            ____                   /   /   \\\r\n"
										+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
										+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
										+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
										+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
										+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
										+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
										+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
										+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
										+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
										+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
										+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
										+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
										+ "");
							}
							if(opgame8==2) {									
							System.out.println("\n- Muito bem, você pode passar..."
									+ "O livro apenas se fecha, abrindo passagem para você, que ao seguir pelo teatro"
									+ "\nse depara com uma grande porta dourada."
									+ "\nDestemido, você abre a porta em um unico movimento!"
									+ "\nUma poderosa luz e anjos cantando o recebe!"
									+ "\nVocê adentra uma grande sala dourada, brilhante e vazia..."
									+ "\nNa sala so tinha um altar, e nele...");
							System.out.println("                                                %%%%%\r\n"
									+ "                                                --=%%\r\n"
									+ "                                              --=-=%%\r\n"
									+ "                                             ==--*   \r\n"
									+ "                                           ===-+#    \r\n"
									+ "                                         ===--#      \r\n"
									+ "                                        =---*#       \r\n"
									+ "                                      ==--=#         \r\n"
									+ "                                     =---*           \r\n"
									+ "                                   +=--+*            \r\n"
									+ "                                 +=--=*              \r\n"
									+ "                                +---+                \r\n"
									+ "            ####              *=--=+                 \r\n"
									+ "          %#+**#            *+--=+                   \r\n"
									+ "          #**#             *---=                     \r\n"
									+ "       ###***%           *=--=+                      \r\n"
									+ "     %#+**####         #*--==                        \r\n"
									+ "     %#**     *#      #---=                          \r\n"
									+ "       #      %+#%  #+--==                           \r\n"
									+ "               *#%%#--==                             \r\n"
									+ "               %%%%#+==                              \r\n"
									+ "               %*++*%%%                              \r\n"
									+ "               %#***%%%%                             \r\n"
									+ "              #*#%%%%*+*#%       %                   \r\n"
									+ "            #**%      %%%*%     %+#%                 \r\n"
									+ "          #*+%           %##%%%*+*#%                 \r\n"
									+ "          +*%              %******#%                 \r\n"
									+ "         *%                %+**%%%                   \r\n"
									+ "       *#                  **#%                      \r\n"
									+ "     *#%                 ****#%                      \r\n"
									+ "  *#%%                   %%%%                        \r\n"
									+ " #+**%                                               \r\n"
									+ " %###                                                \r\n"
									+ " %%%%                                                ");
							System.out.println("\nFinalmente você conseguiu!!! Conquistou a espada lendaria!!!"
									+ "\nA Diamound Dust é sua! Mas lembre-se..."
									+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
									+ "\nPortanto, seu dever agora é usar da espada para proteger o mundo"
									+ "\nda Família 36!"
									+ "\nBoa sorte "+nome+" sua verdadeira batalha começa agora!"
									+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
									+ "\nOlhos vermelhos são vistos na escuridão, você sentia, ali estava ele, Malevolus, o Spring!");
							System.out.println("                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                         ::-*=                    \r\n"
									+ "                        -:.:=*                    \r\n"
									+ "                       =:..:=                     \r\n"
									+ "                      =-...:-+                    \r\n"
									+ "                     **++===+*                    \r\n"
									+ "                    +=---:--=*#                   \r\n"
									+ "                 :++++***+++=--=                  \r\n"
									+ "             .%%@@@@%+=#@@@#=*%%#*-               \r\n"
									+ "          #%@@@@@@@@#-.+%@%=.=%@@@@@#             \r\n"
									+ "          =++++%@@@@%=:+%@%=.=%@@@@@@@@#          \r\n"
									+ "        :-    *=%%%###*#%@%**#%@@@@@@             \r\n"
									+ "        *+     +  %%####%@%######                 \r\n"
									+ "         *.    =  ####%%%%%%##%                   \r\n"
									+ "          **   =++=+**#######**+                  \r\n"
									+ "                #+:.:-*####*+--=:                 \r\n"
									+ "               #+*+==-=+*#*+==+--                 \r\n"
									+ "               #*##**+=++*+=+=---=                \r\n"
									+ "              ##*###****+*=+-==-=+=               \r\n"
									+ "             =***%%####%#++-:-=++++               \r\n"
									+ "             =***%%%##**##+=---+*+*               \r\n"
									+ "            -=*+*%%%##++#**##****+**              \r\n"
									+ "            -=*+*%%#%#+*########***#              \r\n"
									+ "            -+*+#%#%%#+***#%###%*+*#              \r\n"
									+ "            =+++#%%##*=+*+*%%%%%*#++              \r\n"
									+ "            =+=+%%###+=+**+#%%%##**#+             \r\n"
									+ "            =+=*%#*##=-=+*++%#%%##+*              \r\n"
									+ "            ==+%%*+#*=-=+*+=+%#%#**=.             \r\n"
									+ "            ==*%#*+*+=-==*++=*%##++*+             \r\n"
									+ "            =+###++*+--==+*+==*%%*++*+            \r\n"
									+ "             *   ++*=--===*++=+#%%*+++*+-         \r\n"
									+ "                     --==-                        \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  ");
							System.out.println("\n- Vejo que chegou bem longe jovem, porém, tudo termina aqui...");
							System.out.println("\nA voz de Malevolus era ameaçadora, Coberto por seu manto, o mesmo"
									+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
									+ "\nO que você fará?"
									+ "\n1 - Desviar para a esquerda."
									+ "\n2 - Desviar para a diretia.");
							opgame5 = leia.nextInt();
							while(opgame5<=0 || opgame5>2) {
								System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
								opgame5 = leia.nextInt();
							}
							if(opgame5==1) {
								System.out.println("\n Escolhendo a direção errada, você é pego pela avalanche de classes, o poder da magia CRUD é grande...");
								System.out.println("                                                             ,----..\r\n"
										+ "  ,----..                            ____                   /   /   \\\r\n"
										+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
										+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
										+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
										+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
										+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
										+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
										+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
										+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
										+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
										+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
										+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
										+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
										+ "");
							}
							
							if(opgame5==2) {
								System.out.println("\n Você escolheu a direção certa, pulando para a direita e desviando facilmente!"
										+ "\nEntretanto, Malevolus não para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR POSTMAN E SPRING AO MESMO TEMPO"
										+ "\nE agora jovem herói, como irá escapar dessa?"
										+ "\n1 - Desviar para a esquerda."
										+ "\n2 - Desviar para a diretia.");
								opgame6 = leia.nextInt();
								while(opgame6<=0 || opgame6>2) {
									System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
									opgame6 = leia.nextInt();
								}
								if(opgame6==2) {
									System.out.println("\n Escolhendo a direita errada, você é pego pelo travamento infinito e fica para sempre congelado...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								if(opgame6==1) {
									System.out.println("\nVocê consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperança..."
											+ "\nÉ agora, essa é sua ultima chance de derrotar o poderoso Spring, o que fará?"
											+ "\n1 - Usar a espada!"
											+ "\n2 - Desviar para a esquerda!");
								}
								opgame7 = leia.nextInt();
								while(opgame7<=0 || opgame7>2) {
									System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
									opgame7 = leia.nextInt();
								}
								if(opgame7==2) {
									System.out.println("\n Apesar de sua velocidade, a magia de Malevolus o atinge o fazendo entrar em desespero...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								if(opgame7==1) {
									System.out.println("\nCom um movimento forte, você rebate a magia do poderoso Spring o atingindo!"
											+ "\n- Como? Como isso é possível?"
											+ "\nCom um sorriso no rosto, você assiste ao desaparecimento de Malevolus para sempre..."
											+ "\nCom seu dever cumprido, você se retira da caverna sorrindo, olhando o belo por do Sol..."
											+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
											+ "\n'Confie no processo...'"
											+ "\nParabéns "+nome+" você salvou o mundo do desespero e desesperança, todos os habitantes sempre"
											+ "\nirão lembrar do grande herói que um dia os salvou!"
											+ "\nO mundo da Família 36 descansa em uma era de paz mais uma vez!!!");
									System.out.println(" _______  __  .___  ___. \r\n"
											+ "|   ____||  | |   \\/   | \r\n"
											+ "|  |__   |  | |  \\  /  | \r\n"
											+ "|   __|  |  | |  |\\/|  | \r\n"
											+ "|  |     |  | |  |  |  | \r\n"
											+ "|__|     |__| |__|  |__| \r\n"
											+ "                         ");
								}
						}
						if(opgame3==2) {
							System.out.println("\n- Homem insolente!! Sua falta de crença me assusta..."
									+ "\nEm um unico movimento com os cajados, os sábios abrem um buraco negro abaixo de você...");
							System.out.println("                                                             ,----..\r\n"
									+ "  ,----..                            ____                   /   /   \\\r\n"
									+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
									+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
									+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
									+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
									+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
									+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
									+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
									+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
									+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
									+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
									+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
									+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
									+ "");
						}
						
				}
			}
			}
					break;
					
			case 2:
				System.out.println("      +*###*###***#                     \r\n"
						+ "               +%##%@@@%%%%##*#*                    \r\n"
						+ "               #@%#%@@%%%%%%%%%#=-                  \r\n"
						+ "              %%%%%%@%%%%%#####%##-                 \r\n"
						+ "             *#%%%#%%%%%%%%#*#####++                \r\n"
						+ "             =#%%@@@@%%###*######%#:*               \r\n"
						+ "              #%%@%####%%**+*###*#%=*               \r\n"
						+ "             ##%%%#*****#%%#*####*#**#              \r\n"
						+ "              %%%#**++++**#%%#####**##              \r\n"
						+ "              %@#**++==+******==%#==##              \r\n"
						+ "              = #%%#+=+*#*##*=--***=**              \r\n"
						+ "                 %###+==+++=-:--=*==%*#             \r\n"
						+ "                 ****+--===------=+*##*             \r\n"
						+ "                 ****+----===--===-*##*             \r\n"
						+ "                  ***+==-----==+*:#=%##             \r\n"
						+ "                   **++=----==+*#+=+%%%             \r\n"
						+ "                   **#%%#+-==+*#%%#%%%#             \r\n"
						+ "                   ##*##*=-=+**#%@%%%#              \r\n"
						+ "            ###   #%@%*+===***#%%%%%#               \r\n"
						+ "             ##%%%@@@@%%#######%%%###            #%%\r\n"
						+ "              #%%@@@@%@@%#%%#%%%%#%%#      +#%*+##%%\r\n"
						+ "              %%%@%%#*#########%%%##%### :=+*+##%%%%\r\n"
						+ "             %%%%*%%*##%%%%%%+%%#%##*=+**+++=-*%%%%%\r\n"
						+ "             %%%%*@%###%%%%%**%%%#%#-*%*++++++=-#%* \r\n"
						+ "           %%%%%%%%++*#%%%%%%%*#%%###%%======++=:*  \r\n"
						+ "          #%%%%#*=----+==*##%#*%#%%%%%%=----::---   \r\n"
						+ "         #%%%###=+=+--=#**######%##%%%#*---::..-=-  \r\n"
						+ "         %%%####*::#+=+*+*#####%##%%%%#**--::. =#*  \r\n"
						+ "        #%%%#*++++++++**+=++*##%%#%%%%%#**=-::.=#+  \r\n"
						+ "        %%%#*++++++++++++==+#%%#%%%%@%%%#*#*+==*#+  \r\n"
						+ "       %%%#*+++++++++++==--=+*#%%#+%@%%%%%%%%##%%*  \r\n"
						+ "       #%#*++++++++++==-----=+*##=:+@@%%%%#####-*   ");
				
				System.out.println("\nEntendo, então jovem guerreira, como é o seu nome?");
				nome = leia.next();
				System.out.println("\nPois bem, "+nome+" sua aventura começa na frente da caverna mais escura do"
						+"\nmundo da Família 36... Você sente um vento gélido vindo de dentro, suas pernas tremem,"
						+ "\nmas você retira forças e adentra aquele ambiente perigoso..."
						+ "\nAtravessando a caverna você nota pedras espalhadas pelo local, além de manchas"
						+"\nde sangue por toda parte, você engole em seco ao perceber o destino"
						+ "\ndos aspirantes anteriores."
						+ "\nCaminhando mais um pouco você vé uma luz, uma forte luz..."
						+"\nCorrendo em sua direção você percebe.");
				System.out.println("                                                         \r\n"
						+ "                                                         \r\n"
						+ "                           .:                            \r\n"
						+ "                           =-.                           \r\n"
						+ "                          -=::                           \r\n"
						+ "                       . :-::.                           \r\n"
						+ "                     -+-.:-::.:                          \r\n"
						+ "                    =*-:.:--=.:+:                        \r\n"
						+ "                    -*=:::-=#:-=*=                       \r\n"
						+ "                     :=*+=-=*+:=**                       \r\n"
						+ "                       .:+*++#-+*=                       \r\n"
						+ "                          .*-+=+-                        \r\n"
						+ "                           .:::                          \r\n"
						+ "                       .:#%%%%%-:                        \r\n"
						+ "                      -+-:-==+*##+                       \r\n"
						+ "                       .+==+**#%=                        \r\n"
						+ "                        :+++***+                         \r\n"
						+ "                         +++*##:                         \r\n"
						+ "                          +*#%:                          \r\n"
						+ "                          ++##                           \r\n"
						+ "                          -+#*                           \r\n"
						+ "                          -=#+                           \r\n"
						+ "                          :=#=                           \r\n"
						+ "                          .=#-                           \r\n"
						+ "                           =#:                           \r\n"
						+ "                           =#.                           \r\n"
						+ "                           =#                            \r\n"
						+ "                           -*                            \r\n"
						+ "                           -+                            \r\n"
						+ "                           -+                            \r\n"
						+ "                           -+                            \r\n"
						+ "                           -+                            \r\n"
						+ "                                                         \r\n"
						+ "                                                         \r\n"
						+ "");
				
				System.out.println("\nVocê se depara com uma tocha acesa, brilhando intensamente como\"\r\n"
						+ "\no Sol na escuridão do espaço.\"\r\n"
						+ "\nApos acender a sua tocha você segue seu caminho. Agora com luz\"\r\n"
						+ "\nvocê pode reparar na caverna de uma forma mais detalhada!\"\r\n"
						+ "\nÉ possível notar as paredes acinzentadas e estranhamente simétricas,\"\r\n"
						+ "\no chão banhado pelo liquido da vida de antigos heróis parecia imponente,\"\r\n"
						+ "\ntudo naquele lugar gritava grandeza e perigo.\"\r\n"
						+ "\nEm dado momento de sua caminhada, você nota que a caverna anteriormente linear\"\r\n"
						+ "\nagora apresentava dois caminhos para seguir... O que fará jovem heroína?"
						+ "\n1 - Esquerda <--- // ---> 2 - Direita");
				opgame = leia.nextInt();
				while(opgame<=0 || opgame>2) {
					System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
					opgame = leia.nextInt();
				}
					if(opgame==1) {
					System.out.println("\nSeguindo pelo caminho da Esquerda, você se depara com uma incrivel floresta..."
							+ "\nMas como isso seria possível? Você está dentro de uma caverna..."
							+ "\nMas lá estava ela, bela e imponente, banhada pela luz do luar!"
							+ "\nEra possível ver os animais felizes, as águas cristalinas, tudo em perfeito estado."
							+ "\nNão muito distante, você pode ver as arvores em um balançar diferente..."
							+ "\nE sem qualquer aviso, um grande escorpião saltou das arvores e parou em sua frente."
							+ "\nA criatura era gigantesca e amedrontadora!!!");
					System.out.println("                     .                            \r\n"
							+ "                  .=++++:                         \r\n"
							+ "                 .+::--*#*-                       \r\n"
							+ "                 :+.:-*#***+.                     \r\n"
							+ "                 :*.:=++***#+                     \r\n"
							+ "                  ==:+.-*==*#=                    \r\n"
							+ "                  .-++ :+==**+                    \r\n"
							+ "                       :+==+*#.                   \r\n"
							+ "                       -=:-=*#:                   \r\n"
							+ "                       -+===+#*                   \r\n"
							+ "                     .-+-:-=##* ...               \r\n"
							+ "                 .-=+*%#*+*###*=+*+=.             \r\n"
							+ "               -=++=**=+++*##*##*-=++.            \r\n"
							+ "               +:--*++++*+**+##+=-=+#=.           \r\n"
							+ "              .*=+++#=-==+**#+%*+*#+*+:           \r\n"
							+ "             .+:-=+%+---=+###*#::-+=#.            \r\n"
							+ "            .*+==+#%++++++*#**#**=+-              \r\n"
							+ "            -*--=:*+=++******#*==**+              \r\n"
							+ "           .*++=*+*%+:=---=%#%*++**#=             \r\n"
							+ "           -*-.=+*###+::=-*####=-=+*#*            \r\n"
							+ "            :+=::-+*#*#**##++#-:-==+*#            \r\n"
							+ "            +:.::-=**#*#*#++*-..---+*#            \r\n"
							+ "           .*::::=*#*#*###***..:--+=*#-           \r\n"
							+ "           .*---+###%###+####:::=##++#=           \r\n"
							+ "            :+=+*#*##*+#%#*+#*-=*##*+*.           \r\n"
							+ "             .=##**+*###=:*#==*##*+=*.            \r\n"
							+ "              -=--=*=         =+==*+.             \r\n"
							+ "             .====-.        ..++++::...........   \r\n"
							+ ".        . .      . .      .::.::::::::.:::::::. .");
					
					System.out.println();
					System.out.println("\n- Eu me chamo Eclipse, sou o lendario escorpião rei!!!"
							+ "\nPara passar, você deve seguir a regra... Aqui, você precisa responder uma pergunta!"
							+ "\nQuado um programa é encerrado, os dados são salvos nas variaves? Restonda-me criatura inferior...");
					System.out.println();
					System.out.println("\nA voz do escorpião era alta, vibrante e agressiva..."
							+ "\nVocê não tinha para onde correr, ele o alcançaria rapidamente,"
							+ "\nalém disso você não acreditava possuir arma que penetrasse tal corpo..."
							+ "\nEntão jovem heroína, o que irá fazer? O que irá responder?"
							+ "\n1 - Não grande Eclipse!"
							+ "\n2 - Não quero saber, eu vou passar!");
					
					opgame2 = leia.nextInt();
					while(opgame2<=0 || opgame2>2) {
						System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
						opgame2 = leia.nextInt();
					}
						if(opgame2==1) {
							System.out.println("\nMuito bem guerreira, pode passar!");
							System.out.println("\nO grande escorpião abre espaço e finalmente você pode avançar!"
									+ "\nPassando pela floresta, você chega a um grande portão, que ao abrir,"
									+ "\nVocê se depara com uma grande sala, cheia de pastas, no centro,"
									+ "\nVocê pode ver um senhor organizando todas as pastas..."
									+ "\n- Parabéns jovem heroína, falta pouco! Eu me chamo Rafael, o sábio do BACK END...");
							System.out.println("                                                      \r\n"
									+ "                                                      \r\n"
									+ "                                                      \r\n"
									+ "                                .:::.                 \r\n"
									+ "                           :=+*#******+*+==.          \r\n"
									+ "                         :#%%%%%%%######%###-         \r\n"
									+ "                        -++++*##%%%%#%#%%%%%#*:       \r\n"
									+ "                   .:-=++++**####%%%#+=----=*##-      \r\n"
									+ "               .:=*###%###****#*###%+       .*#+      \r\n"
									+ "           .-+*######%%%#%%%%%%####*+:       .##.     \r\n"
									+ "          :########%###***#%%%%%%####*+:      +#.     \r\n"
									+ "          :#%#####%##%%#=*#####%%%%%%%%#+.    :#:     \r\n"
									+ "           :#%%%%%##***--+=+++**#%%%%%%%%#-    #-     \r\n"
									+ "        :.  :%%%%%#*+==:==-:=+*++#%%%%%%%%%+   .*:    \r\n"
									+ "        ::   +%%%%*=+++=+==--=+*+**%%%%%%%%%*.  .+.   \r\n"
									+ "        ::.   .-*+===:-*=--.=:-+*****#%%%%%%%=    .   \r\n"
									+ "        :-:    :-===.:++==+::::=+***+++#%%%%%-        \r\n"
									+ "       .:--. .=++==:.:....::.:::=+=+#**+*#%#=         \r\n"
									+ "     .:---=-:-+*++:::.  ..:::::::===**##*#**+:        \r\n"
									+ "    .---====-:+**-:::.....::--:-:--=+********+-       \r\n"
									+ "    .=+====---**+:-::.....-:--::::-+***#**+*%#*-      \r\n"
									+ "     :--::-:-+##=-:::.....-:-:::::=*#***##++##*:      \r\n"
									+ "      :-::--=+*#*-:::.....-:-::::-+*%*++#%#*#***.     \r\n"
									+ "       -=--=##%*=:::.....:--::::-=++%%*#####****=     \r\n"
									+ "      .:--==#%%*=:::.....:--::-:-+****######*###+     \r\n"
									+ "     .----==*%%#+:::.....:::.--=++**:+##%######**.    \r\n"
									+ "     :-----=+#%#+::.....::..:-=*#***-=+*%####***#-    \r\n"
									+ "     =:----=*#%#*-:.....::.:-++#***#+-:-+#######*=    \r\n"
									+ "    :+--====*#%#*-:.....:.:-=*#**+=-:----=########.   \r\n"
									+ "    =++=====*#%#*-:.....::--+##**---------=**###**+   \r\n"
									+ "    *+#++==+#%%#*-::...:::-+##***==-:-------=+**##*.  \r\n"
									+ "    #*%#*+*%#%%##=::...::-+###**------------==***#*.  \r\n"
									+ "    #*%%%%%%#%%##+::..::--*##***+==-----==--==***##.  \r\n"
									+ "    #*%%%%%%#%%##*::..:-=-###*##*=+===*##+=-+=***##.  \r\n"
									+ "    +##%%%%%#%%##*::..-==+###+#########%%#*+*=**###   \r\n"
									+ "    .#*%%%%%#%###*::::-=*####*#########%%%#**=**##=   \r\n"
									+ "     -*%%%%##=+###-:::-+#####*#########%%%%%#=*###:   \r\n"
									+ "      =%%%%#* +*#*-::--*#####*#########%%%%%#+###*    \r\n"
									+ "      .+%%#*: ****-::-=*#####*#########%%%%%*+###-    \r\n"
									+ "       .+**-  ##**+::-+######+#########%%%%%+*###:    \r\n"
									+ "         .   :##+#*::=*######*########*%%%%%+####     \r\n"
									+ "             -##+##-:=########*#######*%%%%#+###=     \r\n"
									+ "             +##+##=:=########+######%*%%%%**###      \r\n"
									+ "             *##**##--########**######*%%%%*##%+      \r\n"
									+ "             +##**##+:+########+*#####*#%%#*#%%-      \r\n"
									+ "             +###+###+-*########+#####**%#*#%%#.      \r\n"
									+ "             =###*####*-*########+#####***#%%##       \r\n"
									+ "             -####*#####+*########*######%%%##+       \r\n"
									+ "             .##*#**###############*#####%%%%#*       \r\n"
									+ "              *####*################*#####%%%##       ");
							System.out.println("\n- Para passar você deve responder a mais um teste..."
									+ "\n- Complete a palavra: *o**m**"
									+ "\n1 - Mosaico"
									+ "\n2 - Postman"
									+ "\n3 - Gomamon");
							opgame4 = leia.nextInt();
							while(opgame4<=0 || opgame4>3) {
								System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
								opgame4 = leia.nextInt();
							}
							if(opgame4==1) {
								System.out.println("\n- É uma pena, mas seus conhecimentos não são o suficiente, quem sabe na próxima...");
								System.out.println("                                                             ,----..\r\n"
										+ "  ,----..                            ____                   /   /   \\\r\n"
										+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
										+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
										+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
										+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
										+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
										+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
										+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
										+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
										+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
										+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
										+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
										+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
										+ "");
							}
							
							if(opgame4==3) {
								System.out.println("\n- É uma pena, mas seus conhecimentos não são o suficiente, quem sabe na próxima...");
								System.out.println("                                                             ,----..\r\n"
										+ "  ,----..                            ____                   /   /   \\\r\n"
										+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
										+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
										+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
										+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
										+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
										+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
										+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
										+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
										+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
										+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
										+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
										+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
										+ "");
							}
							
							if(opgame4==2) {
								System.out.println("\n- Muito bem, jovem heroína, você pode avançar agora, provou seu conhecimento!");
								System.out.println("\n Passando pelo sábio você atravessa um grande corredor e abre a porta no final do mesmo..."
										+ "você é recebido com uma poderosa luz e anjos cantando!"
										+ "\nVocê adentra uma grande sala dourada, brilhante e vazia..."
										+ "\nNa sala so tinha um altar, e nele...");
								System.out.println("                                                %%%%%\r\n"
										+ "                                                --=%%\r\n"
										+ "                                              --=-=%%\r\n"
										+ "                                             ==--*   \r\n"
										+ "                                           ===-+#    \r\n"
										+ "                                         ===--#      \r\n"
										+ "                                        =---*#       \r\n"
										+ "                                      ==--=#         \r\n"
										+ "                                     =---*           \r\n"
										+ "                                   +=--+*            \r\n"
										+ "                                 +=--=*              \r\n"
										+ "                                +---+                \r\n"
										+ "            ####              *=--=+                 \r\n"
										+ "          %#+**#            *+--=+                   \r\n"
										+ "          #**#             *---=                     \r\n"
										+ "       ###***%           *=--=+                      \r\n"
										+ "     %#+**####         #*--==                        \r\n"
										+ "     %#**     *#      #---=                          \r\n"
										+ "       #      %+#%  #+--==                           \r\n"
										+ "               *#%%#--==                             \r\n"
										+ "               %%%%#+==                              \r\n"
										+ "               %*++*%%%                              \r\n"
										+ "               %#***%%%%                             \r\n"
										+ "              #*#%%%%*+*#%       %                   \r\n"
										+ "            #**%      %%%*%     %+#%                 \r\n"
										+ "          #*+%           %##%%%*+*#%                 \r\n"
										+ "          +*%              %******#%                 \r\n"
										+ "         *%                %+**%%%                   \r\n"
										+ "       *#                  **#%                      \r\n"
										+ "     *#%                 ****#%                      \r\n"
										+ "  *#%%                   %%%%                        \r\n"
										+ " #+**%                                               \r\n"
										+ " %###                                                \r\n"
										+ " %%%%                                                ");
								System.out.println("\nFinalmente você conseguiu!!! Conquistou a espada lendaria!!!"
										+ "\nA Diamound Dust é sua! Mas lembre-se..."
										+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
										+ "\nPortanto, seu dever agora é usar da espada para proteger o mundo"
										+ "\nda Família 36!"
										+ "\nBoa sorte "+nome+" sua verdadeira batalha começa agora!"
										+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
										+ "\nOlhos vermelhos são vistos na escuridão, você sentia, ali estava ele, Malevolus, o Spring!");
								System.out.println("                                                  \r\n"
										+ "                                                  \r\n"
										+ "                                                  \r\n"
										+ "                         ::-*=                    \r\n"
										+ "                        -:.:=*                    \r\n"
										+ "                       =:..:=                     \r\n"
										+ "                      =-...:-+                    \r\n"
										+ "                     **++===+*                    \r\n"
										+ "                    +=---:--=*#                   \r\n"
										+ "                 :++++***+++=--=                  \r\n"
										+ "             .%%@@@@%+=#@@@#=*%%#*-               \r\n"
										+ "          #%@@@@@@@@#-.+%@%=.=%@@@@@#             \r\n"
										+ "          =++++%@@@@%=:+%@%=.=%@@@@@@@@#          \r\n"
										+ "        :-    *=%%%###*#%@%**#%@@@@@@             \r\n"
										+ "        *+     +  %%####%@%######                 \r\n"
										+ "         *.    =  ####%%%%%%##%                   \r\n"
										+ "          **   =++=+**#######**+                  \r\n"
										+ "                #+:.:-*####*+--=:                 \r\n"
										+ "               #+*+==-=+*#*+==+--                 \r\n"
										+ "               #*##**+=++*+=+=---=                \r\n"
										+ "              ##*###****+*=+-==-=+=               \r\n"
										+ "             =***%%####%#++-:-=++++               \r\n"
										+ "             =***%%%##**##+=---+*+*               \r\n"
										+ "            -=*+*%%%##++#**##****+**              \r\n"
										+ "            -=*+*%%#%#+*########***#              \r\n"
										+ "            -+*+#%#%%#+***#%###%*+*#              \r\n"
										+ "            =+++#%%##*=+*+*%%%%%*#++              \r\n"
										+ "            =+=+%%###+=+**+#%%%##**#+             \r\n"
										+ "            =+=*%#*##=-=+*++%#%%##+*              \r\n"
										+ "            ==+%%*+#*=-=+*+=+%#%#**=.             \r\n"
										+ "            ==*%#*+*+=-==*++=*%##++*+             \r\n"
										+ "            =+###++*+--==+*+==*%%*++*+            \r\n"
										+ "             *   ++*=--===*++=+#%%*+++*+-         \r\n"
										+ "                     --==-                        \r\n"
										+ "                                                  \r\n"
										+ "                                                  \r\n"
										+ "                                                  ");
								System.out.println("\n- Vejo que chegou bem longe jovem, porém, tudo termina aqui...");
								System.out.println("\nA voz de Malevolus era ameaçadora, Coberto por seu manto, o mesmo"
										+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
										+ "\nO que você fará?"
										+ "\n1 - Desviar para a esquerda."
										+ "\n2 - Desviar para a diretia.");
								opgame5 = leia.nextInt();
								while(opgame5<=0 || opgame5>2) {
									System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
									opgame5 = leia.nextInt();
								}
								if(opgame5==2) {
									System.out.println("\n Escolhendo a direção errada, você é pega pela avalanche de classes, o poder da magia CRUD é grande...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								
								if(opgame5==1) {
									System.out.println("\n Você escolheu a direção certa, pulando para a esquerda e desviando facilmente!"
											+ "\nEntretanto, Malevolus não para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR O POSTMAN E SPRING AO MESMO TEMPO"
											+ "\nE agora jovem heroína, como irá escapar dessa?"
											+ "\n1 - Desviar para a esquerda."
											+ "\n2 - Desviar para a diretia.");
									opgame6 = leia.nextInt();
									while(opgame6<=0 || opgame6>2) {
										System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
										opgame6 = leia.nextInt();
									}
									if(opgame6==1) {
										System.out.println("\n Escolhendo a esquerda errada, você é pega pelo travamento infinito e fica para sempre congelada...");
										System.out.println("                                                             ,----..\r\n"
												+ "  ,----..                            ____                   /   /   \\\r\n"
												+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
												+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
												+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
												+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
												+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
												+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
												+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
												+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
												+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
												+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
												+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
												+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
												+ "");
									}
									if(opgame6==2) {
										System.out.println("\nVocê consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperança..."
												+ "\nÉ agora, essa é sua ultima chance de derrotar o poderoso Spring, o que fará?"
												+ "\n1 - Usar a espada!"
												+ "\n2 - Desviar para a esquerda!");
									}
									opgame7 = leia.nextInt();
									while(opgame7<=0 || opgame7>2) {
										System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
										opgame7 = leia.nextInt();
									}
									if(opgame7==2) {
										System.out.println("\n Apesar de sua velocidade, a magia de Malevolus a atinge, fazendo com que entre em desespero...");
										System.out.println("                                                             ,----..\r\n"
												+ "  ,----..                            ____                   /   /   \\\r\n"
												+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
												+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
												+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
												+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
												+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
												+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
												+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
												+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
												+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
												+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
												+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
												+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
												+ "");
									}
									if(opgame7==1) {
										System.out.println("\nCom um movimento forte, você rebate a magia do poderoso Spring o atingindo!"
												+ "\n- Como? Como isso é possível?"
												+ "\nCom um sorriso no rosto, você assiste ao desaparecimento de Malevolus para sempre..."
												+ "\nCom seu dever cumprido, você se retira da caverna sorrindo, olhando o belo por do Sol..."
												+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
												+ "\n'Confie no processo...'"
												+ "\nParabéns "+nome+" você salvou o mundo do desespero e desesperança, todos os habitantes sempre"
												+ "\nirão lembrar da grande heroína que um dia os salvou!"
												+ "\nO mundo da Família 36 descansa em uma era de paz mais uma vez!!!");
										System.out.println(" _______  __  .___  ___. \r\n"
												+ "|   ____||  | |   \\/   | \r\n"
												+ "|  |__   |  | |  \\  /  | \r\n"
												+ "|   __|  |  | |  |\\/|  | \r\n"
												+ "|  |     |  | |  |  |  | \r\n"
												+ "|__|     |__| |__|  |__| \r\n"
												+ "                         ");
									}
									
								}
								
							}
							
						}
						if(opgame2==2) {
							System.out.println("\n- Mulher insolente!! Nunca deve-se ir contra as regras!!!"
									+ "\nEm um unico movimento com a calda, o escorpião ataca com toda sua furia...");
							System.out.println("                                                             ,----..\r\n"
									+ "  ,----..                            ____                   /   /   \\\r\n"
									+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
									+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
									+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
									+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
									+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
									+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
									+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
									+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
									+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
									+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
									+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
									+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
									+ "");
						}
					}
					
						
					if(opgame==2) {
						System.out.println("\nDecidindo pela Direita, você segue seu caminho arduamente"
								+ "\naté chegar a uma grande biblioteca, lotada de todos os livros possíveis."
								+ "\nAdentrando o local você percebe um senhor, olhando fixamente para você,"
								+ "\nEle vestia um manto e chapéu, alem de segurar um cajado."
								+ "\nA seu lado, uma senhora com a mesma vestimenta distraida com a imagem"
								+ "\nde uma criança em um livro.");
						
						System.out.println("                                                  \r\n"
								+ "                                                  \r\n"
								+ "                                                  \r\n"
								+ "                                                  \r\n"
								+ "                                                  \r\n"
								+ "                                                  \r\n"
								+ "                                                  \r\n"
								+ "                                                  \r\n"
								+ "                                                  \r\n"
								+ "                                                  \r\n"
								+ "                        *#                        \r\n"
								+ "                       %+%                        \r\n"
								+ "        --             +*                         \r\n"
								+ "        =:             =+-                        \r\n"
								+ "      ==               ==%%  @%%=                 \r\n"
								+ "    .===    :-         +=#%#%%%@%#                \r\n"
								+ "        -+  --         *=+#%%@@%##%+              \r\n"
								+ "         #++*          %%##%@@%*##%%#%#         # \r\n"
								+ "         +  +-         %@%*%%%###%@@%#***      %%@\r\n"
								+ "             +=+       %#**#*###%@@%#*%@@@@@%%%%%@\r\n"
								+ "                        ++*##*+*%%@%##@@##%%@%##% \r\n"
								+ "                        %%@%=-=:-=+#%%@@%%*#%@%   \r\n"
								+ "                       %@@#=%%-.:-=+*@@@@%###%%   \r\n"
								+ "                    # #%%@@@@@#:.::=%@%%@@*#%%%*  \r\n"
								+ "                     %#*#@%.  ##-::::*%%#@#%+=#@  \r\n"
								+ "                     ==+%@#    #%*....#@%#@%+*### \r\n"
								+ "                       -=#%     #@#=..:*@@@@@@%*# \r\n"
								+ "                          .*     -%@%+--=#@@@@%@  \r\n"
								+ "                            -      %@%@%*-==%%%   \r\n"
								+ "                             :      @%@@@@@%@@%   \r\n"
								+ "                              *     %%%           \r\n"
								+ "                                     %            \r\n"
								+ "                                                  \r\n"
								+ "                                                  ");
						
						System.out.println("                                                    \r\n"
								+ "                   .:                               \r\n"
								+ "               .=:+=+-                              \r\n"
								+ "               *:=.:=+:                             \r\n"
								+ "              -+::-*+*=                             \r\n"
								+ "          .==-+:.=*= .:==.                          \r\n"
								+ "           -==-.:**-++*-+-:                         \r\n"
								+ "     ...    .*=.:=+=-::::-++=.                      \r\n"
								+ "     +#*+    =+::.=+===+-.-=+:                      \r\n"
								+ "     +**+%   :+-.:.-**=+-.-=#=:                     \r\n"
								+ "    .****%  .*=+-:----=-:..:=++:                    \r\n"
								+ "  .=*****: .==:-+=:--=::--:*==-::.                  \r\n"
								+ " :*****%:.=..++--:::-:::.=+*@%%##**.                \r\n"
								+ ".%+*#%%##%+*- +-::%%#*+++=*+@####+%%=               \r\n"
								+ ".+++- =##+**--==+%%%#####%%%####=+-=%#:     -       \r\n"
								+ "      +**#%*:..:+=##*=-:-:-=#%#*=+###%#+.  ##*:     \r\n"
								+ "      +#*-%+***=:==#*#*=::-#**#+-=#=*##%#**###*.    \r\n"
								+ "         .%**#%*-==#%#*##-.:+#****+#%###%%%%%##+    \r\n"
								+ "          .++*%+=:+- :=*#%+.:=+*+*+*+#%########-    \r\n"
								+ "              =#**-    ..++%*-.+#*****%%%%%%%+.     \r\n"
								+ "               .+**+.     :-**+--*#**###%%+::       \r\n"
								+ "                 -***-      .+#**-##%++**##+++=.    \r\n"
								+ "                  .+***:    :#*##%#+###*******##*:  \r\n"
								+ "                    :**#+.  :%%##*%++#%%%%%%#####%- \r\n"
								+ "                     .-*##   -*####%+*%%%%%%%####%- \r\n"
								+ "                       .::    .::::##*#%%%-:::::::. \r\n"
								+ "                                    %**%%%:         \r\n"
								+ "                                    %**##%:         \r\n"
								+ "                                    :%###%:         \r\n"
								+ "                                     -###%:         \r\n"
								+ "                                      .---.         \r\n"
								+ "                                                    ");
						
						System.out.println("\n- Já sei o que veio buscar, jovem viajante, Eu me chamo Luis."
								+ "\nSou o sábio do JAVA.");
						System.out.println("\nA voz do senhor era potente, poderia ecoar por todo planeta.");
						System.out.println("\n- Eu me chamo Jéssica, mas pode me chamar de Tia Jess, a sábia do FRONT END.");
						System.out.println("\nA senhora se apresenta, finamente notando sua presença.");
						System.out.println("\n- Para conseguir a espada você só precisa responder a uma pergunta...");
						System.out.println("\nO senhor comentava de forma sorridente, erá visivel que ele gostava"
								+ "\nde suas perguntas!");
						System.out.println("- Um passarinho caiu do ninho de uma arvore..."
								+ "\nComo uma forma de sobreviver, o mesmo começo a bater as asinhas para tentar voar..."
								+ "\nPorem, o passarinho nunca havia voado antes..."
								+ "\nEle irá conseguir?"
								+ "\n1 - VAI DAR BOM!!!"
								+ "\n2 - Acho que não...");
						opgame3 = leia.nextInt();
						while(opgame3<=0 || opgame3>2) {
							System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
							opgame3 = leia.nextInt();
						}
							if(opgame3==1) {
								System.out.println("\nMuito bem guerreira, pode passar!");
								System.out.println("\nOs dois sábios abrem espaço e finalmente você pode avançar!"
										+ "\nPassando pela biblioteca, você chega a um grande portão, que ao abrir,"
										+ "\nVocê adentra a um teatro, completamente cheio de monitores."
										+ "\nNo palco, você observa um livro murmurando...");
								System.out.println("Gerar arte ASCII\r\n"
										+ "Dowloadcópia de\r\n"
										+ "                                     ....            \r\n"
										+ "                                  .......            \r\n"
										+ "     :.....                     ..........           \r\n"
										+ "     ..... .....             ..............          \r\n"
										+ "  .::-.....     ....      ... ............:          \r\n"
										+ " .:===:....         .. ...    .............:         \r\n"
										+ " ::-==-....           :      ................        \r\n"
										+ " :::===.....          :     ..................       \r\n"
										+ "+=::==-:....           :    .................:       \r\n"
										+ "+*::-=--....           :   ....................      \r\n"
										+ "-#-::=-=....            : ......................     \r\n"
										+ ".#=::---:...            : .....................:     \r\n"
										+ " #+::----....            :.......................    \r\n"
										+ " +#-::---....            :....................:::    \r\n"
										+ " -#=::---:...            .:.................::. =    \r\n"
										+ " .#+::---:....            :..............::.    .-   \r\n"
										+ "  **-::---::..            .:..........::.        ::  \r\n"
										+ "  =#=::----:::-:::....     :........:..           -. \r\n"
										+ "  :#+::-----------:::::.....:....:..    ......:::::= \r\n"
										+ "   #*::-:::::::::::::::--::::.:::::::::-:::::::::::--\r\n"
										+ "   +*=-:::::::--==++++**+*+++=-:::::::::--==+++====--\r\n"
										+ "   -#+-::-==+*****##*++=-:.-##==+++=====-::.         \r\n"
										+ "   .#*=+*##**+=--:.         .--:                     \r\n"
										+ "    #*+=-:                                           ");
								System.out.println("\n- Seja bem vindo ao teste final, heroína... Meu nome é Documentação, a boa pratica..."
										+ "\n- Meu questionamento é simples..."
										+ "\nA voz do livro era calma, quase sem emoção."
										+ "\n- Os primeiros sistemas possuiam documentação?"
										+ "\n1 - Sim."
										+ "\n2 - Não.");
								opgame8 = leia.nextInt();
								while(opgame8<=0 || opgame8>2) {
									System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
									opgame8 = leia.nextInt();
								}
								if(opgame8==1) {
									System.out.println("\n- Claro... Você está errada..."
											+ "\nO livro sem emoção brilha intensamente apos seu decreto e"
											+ "\ndemonstrando todo seu poder, o mesmo cresce..."
											+ "\nAgora, tão grande quando o teatro, em um unico movimento ele engole"
											+ "\nvocê de forma abrupta!");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								if(opgame8==2) {									
								System.out.println("\n- Muito bem, você pode passar..."
										+ "O livro apenas se fecha, abrindo passagem para você, que ao seguir pelo teatro"
										+ "\nse depara com uma grande porta dourada."
										+ "\nDestemido, você abre a porta em um unico movimento!"
										+ "\nUma poderosa luz e anjos cantando o recebe!"
										+ "\nVocê adentra uma grande sala dourada, brilhante e vazia..."
										+ "\nNa sala so tinha um altar, e nele...");
								System.out.println("                                                %%%%%\r\n"
										+ "                                                --=%%\r\n"
										+ "                                              --=-=%%\r\n"
										+ "                                             ==--*   \r\n"
										+ "                                           ===-+#    \r\n"
										+ "                                         ===--#      \r\n"
										+ "                                        =---*#       \r\n"
										+ "                                      ==--=#         \r\n"
										+ "                                     =---*           \r\n"
										+ "                                   +=--+*            \r\n"
										+ "                                 +=--=*              \r\n"
										+ "                                +---+                \r\n"
										+ "            ####              *=--=+                 \r\n"
										+ "          %#+**#            *+--=+                   \r\n"
										+ "          #**#             *---=                     \r\n"
										+ "       ###***%           *=--=+                      \r\n"
										+ "     %#+**####         #*--==                        \r\n"
										+ "     %#**     *#      #---=                          \r\n"
										+ "       #      %+#%  #+--==                           \r\n"
										+ "               *#%%#--==                             \r\n"
										+ "               %%%%#+==                              \r\n"
										+ "               %*++*%%%                              \r\n"
										+ "               %#***%%%%                             \r\n"
										+ "              #*#%%%%*+*#%       %                   \r\n"
										+ "            #**%      %%%*%     %+#%                 \r\n"
										+ "          #*+%           %##%%%*+*#%                 \r\n"
										+ "          +*%              %******#%                 \r\n"
										+ "         *%                %+**%%%                   \r\n"
										+ "       *#                  **#%                      \r\n"
										+ "     *#%                 ****#%                      \r\n"
										+ "  *#%%                   %%%%                        \r\n"
										+ " #+**%                                               \r\n"
										+ " %###                                                \r\n"
										+ " %%%%                                                ");
								System.out.println("\nFinalmente você conseguiu!!! Conquistou a espada lendaria!!!"
										+ "\nA Diamound Dust é sua! Mas lembre-se..."
										+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
										+ "\nPortanto, seu dever agora é usar da espada para proteger o mundo"
										+ "\nda Família 36!"
										+ "\nBoa sorte "+nome+" sua verdadeira batalha começa agora!"
										+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
										+ "\nOlhos vermelhos são vistos na escuridão, você sentia, ali estava ele, Malevolus, o Spring!");
								System.out.println("                                                  \r\n"
										+ "                                                  \r\n"
										+ "                                                  \r\n"
										+ "                         ::-*=                    \r\n"
										+ "                        -:.:=*                    \r\n"
										+ "                       =:..:=                     \r\n"
										+ "                      =-...:-+                    \r\n"
										+ "                     **++===+*                    \r\n"
										+ "                    +=---:--=*#                   \r\n"
										+ "                 :++++***+++=--=                  \r\n"
										+ "             .%%@@@@%+=#@@@#=*%%#*-               \r\n"
										+ "          #%@@@@@@@@#-.+%@%=.=%@@@@@#             \r\n"
										+ "          =++++%@@@@%=:+%@%=.=%@@@@@@@@#          \r\n"
										+ "        :-    *=%%%###*#%@%**#%@@@@@@             \r\n"
										+ "        *+     +  %%####%@%######                 \r\n"
										+ "         *.    =  ####%%%%%%##%                   \r\n"
										+ "          **   =++=+**#######**+                  \r\n"
										+ "                #+:.:-*####*+--=:                 \r\n"
										+ "               #+*+==-=+*#*+==+--                 \r\n"
										+ "               #*##**+=++*+=+=---=                \r\n"
										+ "              ##*###****+*=+-==-=+=               \r\n"
										+ "             =***%%####%#++-:-=++++               \r\n"
										+ "             =***%%%##**##+=---+*+*               \r\n"
										+ "            -=*+*%%%##++#**##****+**              \r\n"
										+ "            -=*+*%%#%#+*########***#              \r\n"
										+ "            -+*+#%#%%#+***#%###%*+*#              \r\n"
										+ "            =+++#%%##*=+*+*%%%%%*#++              \r\n"
										+ "            =+=+%%###+=+**+#%%%##**#+             \r\n"
										+ "            =+=*%#*##=-=+*++%#%%##+*              \r\n"
										+ "            ==+%%*+#*=-=+*+=+%#%#**=.             \r\n"
										+ "            ==*%#*+*+=-==*++=*%##++*+             \r\n"
										+ "            =+###++*+--==+*+==*%%*++*+            \r\n"
										+ "             *   ++*=--===*++=+#%%*+++*+-         \r\n"
										+ "                     --==-                        \r\n"
										+ "                                                  \r\n"
										+ "                                                  \r\n"
										+ "                                                  ");
								System.out.println("\n- Vejo que chegou bem longe jovem, porém, tudo termina aqui...");
								System.out.println("\nA voz de Malevolus era ameaçadora, Coberto por seu manto, o mesmo"
										+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
										+ "\nO que você fará?"
										+ "\n1 - Desviar para a esquerda."
										+ "\n2 - Desviar para a diretia.");
								opgame5 = leia.nextInt();
								while(opgame5<=0 || opgame5>2) {
									System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
									opgame5 = leia.nextInt();
								}
								if(opgame5==1) {
									System.out.println("\n Escolhendo a direção errada, você é pega pela avalanche de classes, o poder da magia CRUD é grande...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								
								if(opgame5==2) {
									System.out.println("\n Você escolheu a direção certa, pulando para a direita e desviando facilmente!"
											+ "\nEntretanto, Malevolus não para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR O POSTMAN E SPRING AO MESMO TEMPO"
											+ "\nE agora jovem heroína, como irá escapar dessa?"
											+ "\n1 - Desviar para a esquerda."
											+ "\n2 - Desviar para a diretia.");
									opgame6 = leia.nextInt();
									while(opgame6<=0 || opgame6>2) {
										System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
										opgame6 = leia.nextInt();
									}
									if(opgame6==2) {
										System.out.println("\n Escolhendo a direita errada, você é pega pelo travamento infinito e fica para sempre congelada...");
										System.out.println("                                                             ,----..\r\n"
												+ "  ,----..                            ____                   /   /   \\\r\n"
												+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
												+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
												+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
												+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
												+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
												+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
												+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
												+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
												+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
												+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
												+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
												+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
												+ "");
									}
									if(opgame6==1) {
										System.out.println("\nVocê consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperança..."
												+ "\nÉ agora, essa é sua ultima chance de derrotar o poderoso Spring, o que fará?"
												+ "\n1 - Usar a espada!"
												+ "\n2 - Desviar para a esquerda!");
									}
									opgame7 = leia.nextInt();
									while(opgame7<=0 || opgame7>2) {
										System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
										opgame7 = leia.nextInt();
									}
									if(opgame7==2) {
										System.out.println("\n Apesar de sua velocidade, a magia de Malevolus a atinge, fazendo com que entre em desespero...");
										System.out.println("                                                             ,----..\r\n"
												+ "  ,----..                            ____                   /   /   \\\r\n"
												+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
												+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
												+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
												+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
												+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
												+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
												+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
												+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
												+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
												+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
												+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
												+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
												+ "");
									}
									if(opgame7==1) {
										System.out.println("\nCom um movimento forte, você rebate a magia do poderoso Spring o atingindo!"
												+ "\n- Como? Como isso é possível?"
												+ "\nCom um sorriso no rosto, você assiste ao desaparecimento de Malevolus para sempre..."
												+ "\nCom seu dever cumprido, você se retira da caverna sorrindo, olhando o belo por do Sol..."
												+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
												+ "\n'Confie no processo...'"
												+ "\nParabéns "+nome+" você salvou o mundo do desespero e desesperança, todos os habitantes sempre"
												+ "\nirão lembrar do grande heroína que um dia os salvou!"
												+ "\nO mundo da Família 36 descansa em uma era de paz mais uma vez!!!");
										System.out.println(" _______  __  .___  ___. \r\n"
												+ "|   ____||  | |   \\/   | \r\n"
												+ "|  |__   |  | |  \\  /  | \r\n"
												+ "|   __|  |  | |  |\\/|  | \r\n"
												+ "|  |     |  | |  |  |  | \r\n"
												+ "|__|     |__| |__|  |__| \r\n"
												+ "                         ");
									}
								}
								if(opgame3==2) {
									System.out.println("\n- Mulher insolente!! Sua falta de crença me assusta..."
											+ "\nEm um unico movimento com os cajados, os sábios abrem um buraco negro abaixo de você...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								
						}
					}
					}
						break;
						
				case 3:
					System.out.println("                                                     \r\n"
							+ "                                                     \r\n"
							+ "                                                     \r\n"
							+ "                                                     \r\n"
							+ "      =-*#+ :::+*                                    \r\n"
							+ "     +--=%%:-+**#-    +==#=-                         \r\n"
							+ "     #+++***%%%%%     #*##%#                         \r\n"
							+ "    =-::-*+*#*       **+=+##                         \r\n"
							+ "   =+=*#=++=-      - -*=+=*#                         \r\n"
							+ "   +**++*+##*: :=+#+#*#**#%%%+*++                    \r\n"
							+ "   =*=+*#=+%*-=+*%%*%#%##*#%%##%%#                   \r\n"
							+ "  =****#%+*#-:=*####%%#*##*#%#####*                  \r\n"
							+ "  +-+#**%%%===++=*%%%%+=-#*=*%#***                   \r\n"
							+ "  =+-*#+%%#=*#==*+*%%*--+##+=% #+=                   \r\n"
							+ "   =+-=*=*=+**-=+#+%%#*###%#%   *-                   \r\n"
							+ "   +---=**=*#+-=++#+%%#%#-*%     +==                 \r\n"
							+ "   %**##%+-#+++=*#%*%%%#+=#%      ++.                \r\n"
							+ "   %%#%%%+-:-*#%##%#%#%%#+%%#+    #*#                \r\n"
							+ "   %##%#%+--+#%%%%%####%%%%%%=      ##               \r\n"
							+ "   %%*%##+*: =%%%%%###%%%##%#.      =#               \r\n"
							+ "    %#++#*#*=+%%%%%#%%%%#*#%#+       *==             \r\n"
							+ "    ##-=%**###%%%#%#%%%##*%%%#-       =+.            \r\n"
							+ "    *#-+##+=##%#*#%#%%##**%%%%+-        +            \r\n"
							+ "     +:=#%+=*%%**#%#%@+*#%%%%%%*                     \r\n"
							+ "     ++*%@#*+#%%#%#%@%=##%@%%%%#                     \r\n"
							+ "     #**%%*%##%%%*#%@#=##%@%%%%                      \r\n"
							+ "    -#=-**#%@#####%@@#+##%%%%%#                      \r\n"
							+ "    *%#++#%@%%%%#%%@@%+## %%%                        \r\n"
							+ "     %+=*#@@%*####%%= =   %%+                        \r\n"
							+ "      -+#%%%%**#%         %%                         \r\n"
							+ "     +%*%#  %###         %@%%%%                      \r\n"
							+ "       =*#  =##                                      \r\n"
							+ "        *.  =%%                                      \r\n"
							+ "            *+#                                      \r\n"
							+ "            %*+#                                     \r\n"
							+ "            #*=+#                                    \r\n"
							+ "                                                     \r\n"
							+ "                                                     ");
					
					System.out.println("\nEntendo, então jovem Heroine, como é o seu nome?");
					nome = leia.next();
					System.out.println("\nPois bem, "+nome+" sua aventura começa na frente da caverna mais escura do"
							+"\nmundo da Família 36... Você sente um vento gélido vindo de dentro, suas pernas tremem,"
							+ "\nmas você retira forças e adentra aquele ambiente perigoso..."
							+ "\nAtravessando a caverna você nota pedras espalhadas pelo local, além de manchas"
							+"\nde sangue por toda parte, você engole em seco ao perceber o destino"
							+ "\ndos aspirantes anteriores."
							+ "\nCaminhando mais um pouco você vé uma luz, uma forte luz..."
							+"\nCorrendo em sua direção você percebe.");
					System.out.println("                                                         \r\n"
							+ "                                                         \r\n"
							+ "                           .:                            \r\n"
							+ "                           =-.                           \r\n"
							+ "                          -=::                           \r\n"
							+ "                       . :-::.                           \r\n"
							+ "                     -+-.:-::.:                          \r\n"
							+ "                    =*-:.:--=.:+:                        \r\n"
							+ "                    -*=:::-=#:-=*=                       \r\n"
							+ "                     :=*+=-=*+:=**                       \r\n"
							+ "                       .:+*++#-+*=                       \r\n"
							+ "                          .*-+=+-                        \r\n"
							+ "                           .:::                          \r\n"
							+ "                       .:#%%%%%-:                        \r\n"
							+ "                      -+-:-==+*##+                       \r\n"
							+ "                       .+==+**#%=                        \r\n"
							+ "                        :+++***+                         \r\n"
							+ "                         +++*##:                         \r\n"
							+ "                          +*#%:                          \r\n"
							+ "                          ++##                           \r\n"
							+ "                          -+#*                           \r\n"
							+ "                          -=#+                           \r\n"
							+ "                          :=#=                           \r\n"
							+ "                          .=#-                           \r\n"
							+ "                           =#:                           \r\n"
							+ "                           =#.                           \r\n"
							+ "                           =#                            \r\n"
							+ "                           -*                            \r\n"
							+ "                           -+                            \r\n"
							+ "                           -+                            \r\n"
							+ "                           -+                            \r\n"
							+ "                           -+                            \r\n"
							+ "                                                         \r\n"
							+ "                                                         \r\n"
							+ "");
					
					System.out.println("\nVocê se depara com uma tocha acesa, brilhando intensamente como\"\r\n"
							+ "\no Sol na escuridão do espaço.\"\r\n"
							+ "\nApos acender a sua tocha você segue seu caminho. Agora com luz\"\r\n"
							+ "\nvocê pode reparar na caverna de uma forma mais detalhada!\"\r\n"
							+ "\nÉ possível notar as paredes acinzentadas e estranhamente simétricas,\"\r\n"
							+ "\no chão banhado pelo liquido da vida de antigos heróis parecia imponente,\"\r\n"
							+ "\ntudo naquele lugar gritava grandeza e perigo.\"\r\n"
							+ "\nEm dado momento de sua caminhada, você nota que a caverna anteriormente linear\"\r\n"
							+ "\nagora apresentava dois caminhos para seguir... Qual caminho gostaria de seguir?"
							+ "\n1 - Esquerda <--- // ---> 2 - Direita");
					opgame = leia.nextInt();
					while(opgame<=0 || opgame>2) {
						System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
						opgame = leia.nextInt();
					}
						if(opgame==1) {
						System.out.println("\nSeguindo pelo caminho da Esquerda, você se depara com uma incrivel floresta..."
								+ "\nMas como isso seria possível? Você está dentro de uma caverna..."
								+ "\nMas lá estava ela, bela e imponente, banhada pela luz do luar!"
								+ "\nEra possível ver os animais felizes, as águas cristalinas, tudo em perfeito estado."
								+ "\nNão muito distante, você pode ver as arvores em um balançar diferente..."
								+ "\nE sem qualquer aviso, um grande escorpião saltou das arvores e parou em sua frente."
								+ "\nA criatura era gigantesca e amedrontadora!!!");
						System.out.println("                     .                            \r\n"
								+ "                  .=++++:                         \r\n"
								+ "                 .+::--*#*-                       \r\n"
								+ "                 :+.:-*#***+.                     \r\n"
								+ "                 :*.:=++***#+                     \r\n"
								+ "                  ==:+.-*==*#=                    \r\n"
								+ "                  .-++ :+==**+                    \r\n"
								+ "                       :+==+*#.                   \r\n"
								+ "                       -=:-=*#:                   \r\n"
								+ "                       -+===+#*                   \r\n"
								+ "                     .-+-:-=##* ...               \r\n"
								+ "                 .-=+*%#*+*###*=+*+=.             \r\n"
								+ "               -=++=**=+++*##*##*-=++.            \r\n"
								+ "               +:--*++++*+**+##+=-=+#=.           \r\n"
								+ "              .*=+++#=-==+**#+%*+*#+*+:           \r\n"
								+ "             .+:-=+%+---=+###*#::-+=#.            \r\n"
								+ "            .*+==+#%++++++*#**#**=+-              \r\n"
								+ "            -*--=:*+=++******#*==**+              \r\n"
								+ "           .*++=*+*%+:=---=%#%*++**#=             \r\n"
								+ "           -*-.=+*###+::=-*####=-=+*#*            \r\n"
								+ "            :+=::-+*#*#**##++#-:-==+*#            \r\n"
								+ "            +:.::-=**#*#*#++*-..---+*#            \r\n"
								+ "           .*::::=*#*#*###***..:--+=*#-           \r\n"
								+ "           .*---+###%###+####:::=##++#=           \r\n"
								+ "            :+=+*#*##*+#%#*+#*-=*##*+*.           \r\n"
								+ "             .=##**+*###=:*#==*##*+=*.            \r\n"
								+ "              -=--=*=         =+==*+.             \r\n"
								+ "             .====-.        ..++++::...........   \r\n"
								+ ".        . .      . .      .::.::::::::.:::::::. .");
						
						System.out.println();
						System.out.println("\n- Eu me chamo Eclipse, sou o lendario escorpião rei!!!"
								+ "\nPara passar, você deve seguir a regra... Aqui, você precisa responder uma pergunta!"
								+ "\nQuado um programa é encerrado, os dados são salvos nas variaves? Restonda-me criatura inferior...");
						System.out.println();
						System.out.println("\nA voz do escorpião era alta, vibrante e agressiva..."
								+ "\nVocê não tinha para onde correr, ele o alcançaria rapidamente,"
								+ "\nalém disso você não acreditava possuir arma que penetrasse tal corpo..."
								+ "\nEntão jovem heroine, o que irá fazer? O que irá responder?"
								+ "\n1 - Não grande Eclipse!"
								+ "\n2 - Não quero saber, eu vou passar!");
						
						opgame2 = leia.nextInt();
						while(opgame2<=0 || opgame2>2) {
							System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
							opgame2 = leia.nextInt();
						}
							if(opgame2==1) {
								System.out.println("\nMuito bem heroine, pode passar!");
								System.out.println("\nO grande escorpião abre espaço e finalmente você pode avançar!"
										+ "\nPassando pela floresta, você chega a um grande portão, que ao abrir,"
										+ "\nVocê se depara com uma grande sala, cheia de pastas, no centro,"
										+ "\nVocê pode ver um senhor organizando todas as pastas..."
										+ "\n- Parabéns jovem heroine, falta pouco! Eu me chamo Rafael, o sábio do BACK END...");
								System.out.println("                                                      \r\n"
										+ "                                                      \r\n"
										+ "                                                      \r\n"
										+ "                                .:::.                 \r\n"
										+ "                           :=+*#******+*+==.          \r\n"
										+ "                         :#%%%%%%%######%###-         \r\n"
										+ "                        -++++*##%%%%#%#%%%%%#*:       \r\n"
										+ "                   .:-=++++**####%%%#+=----=*##-      \r\n"
										+ "               .:=*###%###****#*###%+       .*#+      \r\n"
										+ "           .-+*######%%%#%%%%%%####*+:       .##.     \r\n"
										+ "          :########%###***#%%%%%%####*+:      +#.     \r\n"
										+ "          :#%#####%##%%#=*#####%%%%%%%%#+.    :#:     \r\n"
										+ "           :#%%%%%##***--+=+++**#%%%%%%%%#-    #-     \r\n"
										+ "        :.  :%%%%%#*+==:==-:=+*++#%%%%%%%%%+   .*:    \r\n"
										+ "        ::   +%%%%*=+++=+==--=+*+**%%%%%%%%%*.  .+.   \r\n"
										+ "        ::.   .-*+===:-*=--.=:-+*****#%%%%%%%=    .   \r\n"
										+ "        :-:    :-===.:++==+::::=+***+++#%%%%%-        \r\n"
										+ "       .:--. .=++==:.:....::.:::=+=+#**+*#%#=         \r\n"
										+ "     .:---=-:-+*++:::.  ..:::::::===**##*#**+:        \r\n"
										+ "    .---====-:+**-:::.....::--:-:--=+********+-       \r\n"
										+ "    .=+====---**+:-::.....-:--::::-+***#**+*%#*-      \r\n"
										+ "     :--::-:-+##=-:::.....-:-:::::=*#***##++##*:      \r\n"
										+ "      :-::--=+*#*-:::.....-:-::::-+*%*++#%#*#***.     \r\n"
										+ "       -=--=##%*=:::.....:--::::-=++%%*#####****=     \r\n"
										+ "      .:--==#%%*=:::.....:--::-:-+****######*###+     \r\n"
										+ "     .----==*%%#+:::.....:::.--=++**:+##%######**.    \r\n"
										+ "     :-----=+#%#+::.....::..:-=*#***-=+*%####***#-    \r\n"
										+ "     =:----=*#%#*-:.....::.:-++#***#+-:-+#######*=    \r\n"
										+ "    :+--====*#%#*-:.....:.:-=*#**+=-:----=########.   \r\n"
										+ "    =++=====*#%#*-:.....::--+##**---------=**###**+   \r\n"
										+ "    *+#++==+#%%#*-::...:::-+##***==-:-------=+**##*.  \r\n"
										+ "    #*%#*+*%#%%##=::...::-+###**------------==***#*.  \r\n"
										+ "    #*%%%%%%#%%##+::..::--*##***+==-----==--==***##.  \r\n"
										+ "    #*%%%%%%#%%##*::..:-=-###*##*=+===*##+=-+=***##.  \r\n"
										+ "    +##%%%%%#%%##*::..-==+###+#########%%#*+*=**###   \r\n"
										+ "    .#*%%%%%#%###*::::-=*####*#########%%%#**=**##=   \r\n"
										+ "     -*%%%%##=+###-:::-+#####*#########%%%%%#=*###:   \r\n"
										+ "      =%%%%#* +*#*-::--*#####*#########%%%%%#+###*    \r\n"
										+ "      .+%%#*: ****-::-=*#####*#########%%%%%*+###-    \r\n"
										+ "       .+**-  ##**+::-+######+#########%%%%%+*###:    \r\n"
										+ "         .   :##+#*::=*######*########*%%%%%+####     \r\n"
										+ "             -##+##-:=########*#######*%%%%#+###=     \r\n"
										+ "             +##+##=:=########+######%*%%%%**###      \r\n"
										+ "             *##**##--########**######*%%%%*##%+      \r\n"
										+ "             +##**##+:+########+*#####*#%%#*#%%-      \r\n"
										+ "             +###+###+-*########+#####**%#*#%%#.      \r\n"
										+ "             =###*####*-*########+#####***#%%##       \r\n"
										+ "             -####*#####+*########*######%%%##+       \r\n"
										+ "             .##*#**###############*#####%%%%#*       \r\n"
										+ "              *####*################*#####%%%##       ");
								System.out.println("\n- Para passar você deve responder a mais um teste..."
										+ "\n- Complete a palavra: *o**m**"
										+ "\n1 - Mosaico"
										+ "\n2 - Postman"
										+ "\n3 - Gomamon");
								opgame4 = leia.nextInt();
								while(opgame4<=0 || opgame4>3) {
									System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
									opgame4 = leia.nextInt();
								}
								if(opgame4==1) {
									System.out.println("\n- É uma pena, mas seus conhecimentos não são o suficiente, quem sabe na próxima...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								
								if(opgame4==3) {
									System.out.println("\n- É uma pena, mas seus conhecimentos não são o suficiente, quem sabe na próxima...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								
								if(opgame4==2) {
									System.out.println("\n- Muito bem, jovem heroine, você pode avançar agora, provou seu conhecimento!");
									System.out.println("\n Passando pelo sábio você atravessa um grande corredor e abre a porta no final do mesmo..."
											+ "você é recebido com uma poderosa luz e anjos cantando!"
											+ "\nVocê adentra uma grande sala dourada, brilhante e vazia..."
											+ "\nNa sala so tinha um altar, e nele...");
									System.out.println("                                                %%%%%\r\n"
											+ "                                                --=%%\r\n"
											+ "                                              --=-=%%\r\n"
											+ "                                             ==--*   \r\n"
											+ "                                           ===-+#    \r\n"
											+ "                                         ===--#      \r\n"
											+ "                                        =---*#       \r\n"
											+ "                                      ==--=#         \r\n"
											+ "                                     =---*           \r\n"
											+ "                                   +=--+*            \r\n"
											+ "                                 +=--=*              \r\n"
											+ "                                +---+                \r\n"
											+ "            ####              *=--=+                 \r\n"
											+ "          %#+**#            *+--=+                   \r\n"
											+ "          #**#             *---=                     \r\n"
											+ "       ###***%           *=--=+                      \r\n"
											+ "     %#+**####         #*--==                        \r\n"
											+ "     %#**     *#      #---=                          \r\n"
											+ "       #      %+#%  #+--==                           \r\n"
											+ "               *#%%#--==                             \r\n"
											+ "               %%%%#+==                              \r\n"
											+ "               %*++*%%%                              \r\n"
											+ "               %#***%%%%                             \r\n"
											+ "              #*#%%%%*+*#%       %                   \r\n"
											+ "            #**%      %%%*%     %+#%                 \r\n"
											+ "          #*+%           %##%%%*+*#%                 \r\n"
											+ "          +*%              %******#%                 \r\n"
											+ "         *%                %+**%%%                   \r\n"
											+ "       *#                  **#%                      \r\n"
											+ "     *#%                 ****#%                      \r\n"
											+ "  *#%%                   %%%%                        \r\n"
											+ " #+**%                                               \r\n"
											+ " %###                                                \r\n"
											+ " %%%%                                                ");
									System.out.println("\nFinalmente você conseguiu!!! Conquistou a espada lendaria!!!"
											+ "\nA Diamound Dust é sua! Mas lembre-se..."
											+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
											+ "\nPortanto, seu dever agora é usar da espada para proteger o mundo"
											+ "\nda Família 36!"
											+ "\nBoa sorte "+nome+" sua verdadeira batalha começa agora!"
											+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
											+ "\nOlhos vermelhos são vistos na escuridão, você sentia, ali estava ele, Malevolus, o Spring!");
									System.out.println("                                                  \r\n"
											+ "                                                  \r\n"
											+ "                                                  \r\n"
											+ "                         ::-*=                    \r\n"
											+ "                        -:.:=*                    \r\n"
											+ "                       =:..:=                     \r\n"
											+ "                      =-...:-+                    \r\n"
											+ "                     **++===+*                    \r\n"
											+ "                    +=---:--=*#                   \r\n"
											+ "                 :++++***+++=--=                  \r\n"
											+ "             .%%@@@@%+=#@@@#=*%%#*-               \r\n"
											+ "          #%@@@@@@@@#-.+%@%=.=%@@@@@#             \r\n"
											+ "          =++++%@@@@%=:+%@%=.=%@@@@@@@@#          \r\n"
											+ "        :-    *=%%%###*#%@%**#%@@@@@@             \r\n"
											+ "        *+     +  %%####%@%######                 \r\n"
											+ "         *.    =  ####%%%%%%##%                   \r\n"
											+ "          **   =++=+**#######**+                  \r\n"
											+ "                #+:.:-*####*+--=:                 \r\n"
											+ "               #+*+==-=+*#*+==+--                 \r\n"
											+ "               #*##**+=++*+=+=---=                \r\n"
											+ "              ##*###****+*=+-==-=+=               \r\n"
											+ "             =***%%####%#++-:-=++++               \r\n"
											+ "             =***%%%##**##+=---+*+*               \r\n"
											+ "            -=*+*%%%##++#**##****+**              \r\n"
											+ "            -=*+*%%#%#+*########***#              \r\n"
											+ "            -+*+#%#%%#+***#%###%*+*#              \r\n"
											+ "            =+++#%%##*=+*+*%%%%%*#++              \r\n"
											+ "            =+=+%%###+=+**+#%%%##**#+             \r\n"
											+ "            =+=*%#*##=-=+*++%#%%##+*              \r\n"
											+ "            ==+%%*+#*=-=+*+=+%#%#**=.             \r\n"
											+ "            ==*%#*+*+=-==*++=*%##++*+             \r\n"
											+ "            =+###++*+--==+*+==*%%*++*+            \r\n"
											+ "             *   ++*=--===*++=+#%%*+++*+-         \r\n"
											+ "                     --==-                        \r\n"
											+ "                                                  \r\n"
											+ "                                                  \r\n"
											+ "                                                  ");
									System.out.println("\n- Vejo que chegou bem longe jovem, porém, tudo termina aqui...");
									System.out.println("\nA voz de Malevolus era ameaçadora, Coberto por seu manto, o mesmo"
											+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
											+ "\nO que você fará?"
											+ "\n1 - Desviar para a esquerda."
											+ "\n2 - Desviar para a diretia.");
									opgame5 = leia.nextInt();
									while(opgame5<=0 || opgame5>2) {
										System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
										opgame5 = leia.nextInt();
									}
									if(opgame5==2) {
										System.out.println("\n Escolhendo a direção errada, você recebe a avalanche de classes, o poder da magia CRUD é grande...");
										System.out.println("                                                             ,----..\r\n"
												+ "  ,----..                            ____                   /   /   \\\r\n"
												+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
												+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
												+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
												+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
												+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
												+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
												+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
												+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
												+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
												+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
												+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
												+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
												+ "");
									}
									
									if(opgame5==1) {
										System.out.println("\n Você escolheu a direção certa, pulando para a esquerda e desviando facilmente!"
												+ "\nEntretanto, Malevolus não para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR POSTMAN E SPRING AO MESMO TEMPO"
												+ "\nE agora jovem heroine, como irá escapar dessa?"
												+ "\n1 - Desviar para a esquerda."
												+ "\n2 - Desviar para a diretia.");
										opgame6 = leia.nextInt();
										while(opgame6<=0 || opgame6>2) {
											System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
											opgame6 = leia.nextInt();
										}
										if(opgame6==1) {
											System.out.println("\n Escolhendo a esquerda errada, você recebe o travamento infinito e fica para sempre congelade...");
											System.out.println("                                                             ,----..\r\n"
													+ "  ,----..                            ____                   /   /   \\\r\n"
													+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
													+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
													+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
													+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
													+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
													+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
													+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
													+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
													+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
													+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
													+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
													+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
													+ "");
										}
										if(opgame6==2) {
											System.out.println("\nVocê consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperança..."
													+ "\nÉ agora, essa é sua ultima chance de derrotar o poderoso Spring, o que fará?"
													+ "\n1 - Usar a espada!"
													+ "\n2 - Desviar para a esquerda!");
										}
										opgame7 = leia.nextInt();
										while(opgame7<=0 || opgame7>2) {
											System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
											opgame7 = leia.nextInt();
										}
										if(opgame7==2) {
											System.out.println("\n Apesar de sua velocidade, a magia de Malevolus atinge voce fazendo com que entre em desespero...");
											System.out.println("                                                             ,----..\r\n"
													+ "  ,----..                            ____                   /   /   \\\r\n"
													+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
													+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
													+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
													+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
													+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
													+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
													+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
													+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
													+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
													+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
													+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
													+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
													+ "");
										}
										if(opgame7==1) {
											System.out.println("\nCom um movimento forte, você rebate a magia do poderoso Spring o atingindo!"
													+ "\n- Como? Como isso é possível?"
													+ "\nCom um sorriso no rosto, você assiste ao desaparecimento de Malevolus para sempre..."
													+ "\nCom seu dever cumprido, você se retira da caverna sorrindo, olhando o belo por do Sol..."
													+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
													+ "\n'Confie no processo...'"
													+ "\nParabéns "+nome+" você salvou o mundo do desespero e desesperança, todos os habitantes sempre"
													+ "\nirão lembrar quem um dia os salvou!"
													+ "\nO mundo da Família 36 descansa em uma era de paz mais uma vez!!!");
											System.out.println(" _______  __  .___  ___. \r\n"
													+ "|   ____||  | |   \\/   | \r\n"
													+ "|  |__   |  | |  \\  /  | \r\n"
													+ "|   __|  |  | |  |\\/|  | \r\n"
													+ "|  |     |  | |  |  |  | \r\n"
													+ "|__|     |__| |__|  |__| \r\n"
													+ "                         ");
										}
										
									}
									
								}
								
							}
							if(opgame2==2) {
								System.out.println("\n- Mulher insolente!! Nunca deve-se ir contra as regras!!!"
										+ "\nEm um unico movimento com a calda, o escorpião ataca com toda sua furia...");
								System.out.println("                                                             ,----..\r\n"
										+ "  ,----..                            ____                   /   /   \\\r\n"
										+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
										+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
										+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
										+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
										+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
										+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
										+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
										+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
										+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
										+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
										+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
										+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
										+ "");
							}
						}
							
							
						if(opgame==2) {
							System.out.println("\nDecidindo pela Direita, você segue seu caminho arduamente"
									+ "\naté chegar a uma grande biblioteca, lotada de todos os livros possíveis."
									+ "\nAdentrando o local você percebe um senhor, olhando fixamente para você,"
									+ "\nEle vestia um manto e chapéu, alem de segurar um cajado."
									+ "\nA seu lado, uma senhora com a mesma vestimenta distraida com a imagem"
									+ "\nde uma criança em um livro.");
							
							System.out.println("                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                                                  \r\n"
									+ "                        *#                        \r\n"
									+ "                       %+%                        \r\n"
									+ "        --             +*                         \r\n"
									+ "        =:             =+-                        \r\n"
									+ "      ==               ==%%  @%%=                 \r\n"
									+ "    .===    :-         +=#%#%%%@%#                \r\n"
									+ "        -+  --         *=+#%%@@%##%+              \r\n"
									+ "         #++*          %%##%@@%*##%%#%#         # \r\n"
									+ "         +  +-         %@%*%%%###%@@%#***      %%@\r\n"
									+ "             +=+       %#**#*###%@@%#*%@@@@@%%%%%@\r\n"
									+ "                        ++*##*+*%%@%##@@##%%@%##% \r\n"
									+ "                        %%@%=-=:-=+#%%@@%%*#%@%   \r\n"
									+ "                       %@@#=%%-.:-=+*@@@@%###%%   \r\n"
									+ "                    # #%%@@@@@#:.::=%@%%@@*#%%%*  \r\n"
									+ "                     %#*#@%.  ##-::::*%%#@#%+=#@  \r\n"
									+ "                     ==+%@#    #%*....#@%#@%+*### \r\n"
									+ "                       -=#%     #@#=..:*@@@@@@%*# \r\n"
									+ "                          .*     -%@%+--=#@@@@%@  \r\n"
									+ "                            -      %@%@%*-==%%%   \r\n"
									+ "                             :      @%@@@@@%@@%   \r\n"
									+ "                              *     %%%           \r\n"
									+ "                                     %            \r\n"
									+ "                                                  \r\n"
									+ "                                                  ");
							
							System.out.println("                                                    \r\n"
									+ "                   .:                               \r\n"
									+ "               .=:+=+-                              \r\n"
									+ "               *:=.:=+:                             \r\n"
									+ "              -+::-*+*=                             \r\n"
									+ "          .==-+:.=*= .:==.                          \r\n"
									+ "           -==-.:**-++*-+-:                         \r\n"
									+ "     ...    .*=.:=+=-::::-++=.                      \r\n"
									+ "     +#*+    =+::.=+===+-.-=+:                      \r\n"
									+ "     +**+%   :+-.:.-**=+-.-=#=:                     \r\n"
									+ "    .****%  .*=+-:----=-:..:=++:                    \r\n"
									+ "  .=*****: .==:-+=:--=::--:*==-::.                  \r\n"
									+ " :*****%:.=..++--:::-:::.=+*@%%##**.                \r\n"
									+ ".%+*#%%##%+*- +-::%%#*+++=*+@####+%%=               \r\n"
									+ ".+++- =##+**--==+%%%#####%%%####=+-=%#:     -       \r\n"
									+ "      +**#%*:..:+=##*=-:-:-=#%#*=+###%#+.  ##*:     \r\n"
									+ "      +#*-%+***=:==#*#*=::-#**#+-=#=*##%#**###*.    \r\n"
									+ "         .%**#%*-==#%#*##-.:+#****+#%###%%%%%##+    \r\n"
									+ "          .++*%+=:+- :=*#%+.:=+*+*+*+#%########-    \r\n"
									+ "              =#**-    ..++%*-.+#*****%%%%%%%+.     \r\n"
									+ "               .+**+.     :-**+--*#**###%%+::       \r\n"
									+ "                 -***-      .+#**-##%++**##+++=.    \r\n"
									+ "                  .+***:    :#*##%#+###*******##*:  \r\n"
									+ "                    :**#+.  :%%##*%++#%%%%%%#####%- \r\n"
									+ "                     .-*##   -*####%+*%%%%%%%####%- \r\n"
									+ "                       .::    .::::##*#%%%-:::::::. \r\n"
									+ "                                    %**%%%:         \r\n"
									+ "                                    %**##%:         \r\n"
									+ "                                    :%###%:         \r\n"
									+ "                                     -###%:         \r\n"
									+ "                                      .---.         \r\n"
									+ "                                                    ");
							
							System.out.println("\n- Já sei o que veio buscar, jovem viajante, Eu me chamo Luis."
									+ "\nSou o sábio do JAVA.");
							System.out.println("\nA voz do senhor era potente, poderia ecoar por todo planeta.");
							System.out.println("\n- Eu me chamo Jéssica, mas pode me chamar de Tia Jess, a sábia do FRONT END.");
							System.out.println("\nA senhora se apresenta, finamente notando sua presença.");
							System.out.println("\n- Para conseguir a espada você só precisa responder a uma pergunta...");
							System.out.println("\nO senhor comentava de forma sorridente, erá visivel que ele gostava"
									+ "\nde suas perguntas!");
							System.out.println("- Um passarinho caiu do ninho de uma arvore..."
									+ "\nComo uma forma de sobreviver, o mesmo começo a bater as asinhas para tentar voar..."
									+ "\nPorem, o passarinho nunca havia voado antes..."
									+ "\nEle irá conseguir?"
									+ "\n1 - VAI DAR BOM!!!"
									+ "\n2 - Acho que não...");
							opgame3 = leia.nextInt();
							while(opgame3<=0 || opgame3>2) {
								System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
								opgame3 = leia.nextInt();
							}
								if(opgame3==1) {
									System.out.println("\nMuito bem heroine, pode passar!");
									System.out.println("\nOs dois sábios abrem espaço e finalmente você pode avançar!"
											+ "\nPassando pela biblioteca, você chega a um grande portão, que ao abrir,"
											+ "\nVocê adentra a um teatro, completamente cheio de monitores."
											+ "\nNo palco, você observa um livro murmurando...");
									System.out.println("Gerar arte ASCII\r\n"
											+ "Dowloadcópia de\r\n"
											+ "                                     ....            \r\n"
											+ "                                  .......            \r\n"
											+ "     :.....                     ..........           \r\n"
											+ "     ..... .....             ..............          \r\n"
											+ "  .::-.....     ....      ... ............:          \r\n"
											+ " .:===:....         .. ...    .............:         \r\n"
											+ " ::-==-....           :      ................        \r\n"
											+ " :::===.....          :     ..................       \r\n"
											+ "+=::==-:....           :    .................:       \r\n"
											+ "+*::-=--....           :   ....................      \r\n"
											+ "-#-::=-=....            : ......................     \r\n"
											+ ".#=::---:...            : .....................:     \r\n"
											+ " #+::----....            :.......................    \r\n"
											+ " +#-::---....            :....................:::    \r\n"
											+ " -#=::---:...            .:.................::. =    \r\n"
											+ " .#+::---:....            :..............::.    .-   \r\n"
											+ "  **-::---::..            .:..........::.        ::  \r\n"
											+ "  =#=::----:::-:::....     :........:..           -. \r\n"
											+ "  :#+::-----------:::::.....:....:..    ......:::::= \r\n"
											+ "   #*::-:::::::::::::::--::::.:::::::::-:::::::::::--\r\n"
											+ "   +*=-:::::::--==++++**+*+++=-:::::::::--==+++====--\r\n"
											+ "   -#+-::-==+*****##*++=-:.-##==+++=====-::.         \r\n"
											+ "   .#*=+*##**+=--:.         .--:                     \r\n"
											+ "    #*+=-:                                           ");
									System.out.println("\n- Seja bem vindo ao teste final, heroine... Meu nome é Documentação, a boa pratica..."
											+ "\n- Meu questionamento é simples..."
											+ "\nA voz do livro era calma, quase sem emoção."
											+ "\n- Os primeiros sistemas possuiam documentação?"
											+ "\n1 - Sim."
											+ "\n2 - Não.");
									opgame8 = leia.nextInt();
									while(opgame8<=0 || opgame8>2) {
										System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
										opgame3 = leia.nextInt();
									}
									if(opgame8==1) {
										System.out.println("\n- Claro... Você está errade..."
												+ "\nO livro sem emoção brilha intensamente apos seu decreto e"
												+ "\ndemonstrando todo seu poder, o mesmo cresce..."
												+ "\nAgora, tão grande quando o teatro, em um unico movimento ele engole"
												+ "\nvocê de forma abrupta!");
										System.out.println("                                                             ,----..\r\n"
												+ "  ,----..                            ____                   /   /   \\\r\n"
												+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
												+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
												+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
												+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
												+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
												+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
												+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
												+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
												+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
												+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
												+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
												+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
												+ "");
									}
									if(opgame8==2) {									
									System.out.println("\n- Muito bem, você pode passar..."
											+ "O livro apenas se fecha, abrindo passagem para você, que ao seguir pelo teatro"
											+ "\nse depara com uma grande porta dourada."
											+ "\nDestemido, você abre a porta em um unico movimento!"
											+ "\nUma poderosa luz e anjos cantando o recebe!"
											+ "\nVocê adentra uma grande sala dourada, brilhante e vazia..."
											+ "\nNa sala so tinha um altar, e nele...");
									System.out.println("                                                %%%%%\r\n"
											+ "                                                --=%%\r\n"
											+ "                                              --=-=%%\r\n"
											+ "                                             ==--*   \r\n"
											+ "                                           ===-+#    \r\n"
											+ "                                         ===--#      \r\n"
											+ "                                        =---*#       \r\n"
											+ "                                      ==--=#         \r\n"
											+ "                                     =---*           \r\n"
											+ "                                   +=--+*            \r\n"
											+ "                                 +=--=*              \r\n"
											+ "                                +---+                \r\n"
											+ "            ####              *=--=+                 \r\n"
											+ "          %#+**#            *+--=+                   \r\n"
											+ "          #**#             *---=                     \r\n"
											+ "       ###***%           *=--=+                      \r\n"
											+ "     %#+**####         #*--==                        \r\n"
											+ "     %#**     *#      #---=                          \r\n"
											+ "       #      %+#%  #+--==                           \r\n"
											+ "               *#%%#--==                             \r\n"
											+ "               %%%%#+==                              \r\n"
											+ "               %*++*%%%                              \r\n"
											+ "               %#***%%%%                             \r\n"
											+ "              #*#%%%%*+*#%       %                   \r\n"
											+ "            #**%      %%%*%     %+#%                 \r\n"
											+ "          #*+%           %##%%%*+*#%                 \r\n"
											+ "          +*%              %******#%                 \r\n"
											+ "         *%                %+**%%%                   \r\n"
											+ "       *#                  **#%                      \r\n"
											+ "     *#%                 ****#%                      \r\n"
											+ "  *#%%                   %%%%                        \r\n"
											+ " #+**%                                               \r\n"
											+ " %###                                                \r\n"
											+ " %%%%                                                ");
									System.out.println("\nFinalmente você conseguiu!!! Conquistou a espada lendaria!!!"
											+ "\nA Diamound Dust é sua! Mas lembre-se..."
											+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
											+ "\nPortanto, seu dever agora é usar da espada para proteger o mundo"
											+ "\nda Família 36!"
											+ "\nBoa sorte "+nome+" sua verdadeira batalha começa agora!"
											+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
											+ "\nOlhos vermelhos são vistos na escuridão, você sentia, ali estava ele, Malevolus, o Spring!");
									System.out.println("                                                  \r\n"
											+ "                                                  \r\n"
											+ "                                                  \r\n"
											+ "                         ::-*=                    \r\n"
											+ "                        -:.:=*                    \r\n"
											+ "                       =:..:=                     \r\n"
											+ "                      =-...:-+                    \r\n"
											+ "                     **++===+*                    \r\n"
											+ "                    +=---:--=*#                   \r\n"
											+ "                 :++++***+++=--=                  \r\n"
											+ "             .%%@@@@%+=#@@@#=*%%#*-               \r\n"
											+ "          #%@@@@@@@@#-.+%@%=.=%@@@@@#             \r\n"
											+ "          =++++%@@@@%=:+%@%=.=%@@@@@@@@#          \r\n"
											+ "        :-    *=%%%###*#%@%**#%@@@@@@             \r\n"
											+ "        *+     +  %%####%@%######                 \r\n"
											+ "         *.    =  ####%%%%%%##%                   \r\n"
											+ "          **   =++=+**#######**+                  \r\n"
											+ "                #+:.:-*####*+--=:                 \r\n"
											+ "               #+*+==-=+*#*+==+--                 \r\n"
											+ "               #*##**+=++*+=+=---=                \r\n"
											+ "              ##*###****+*=+-==-=+=               \r\n"
											+ "             =***%%####%#++-:-=++++               \r\n"
											+ "             =***%%%##**##+=---+*+*               \r\n"
											+ "            -=*+*%%%##++#**##****+**              \r\n"
											+ "            -=*+*%%#%#+*########***#              \r\n"
											+ "            -+*+#%#%%#+***#%###%*+*#              \r\n"
											+ "            =+++#%%##*=+*+*%%%%%*#++              \r\n"
											+ "            =+=+%%###+=+**+#%%%##**#+             \r\n"
											+ "            =+=*%#*##=-=+*++%#%%##+*              \r\n"
											+ "            ==+%%*+#*=-=+*+=+%#%#**=.             \r\n"
											+ "            ==*%#*+*+=-==*++=*%##++*+             \r\n"
											+ "            =+###++*+--==+*+==*%%*++*+            \r\n"
											+ "             *   ++*=--===*++=+#%%*+++*+-         \r\n"
											+ "                     --==-                        \r\n"
											+ "                                                  \r\n"
											+ "                                                  \r\n"
											+ "                                                  ");
									System.out.println("\n- Vejo que chegou bem longe jovem, porém, tudo termina aqui...");
									System.out.println("\nA voz de Malevolus era ameaçadora, Coberto por seu manto, o mesmo"
											+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
											+ "\nO que você fará?"
											+ "\n1 - Desviar para a esquerda."
											+ "\n2 - Desviar para a diretia.");
									opgame5 = leia.nextInt();
									while(opgame5<=0 || opgame5>2) {
										System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
										opgame5 = leia.nextInt();
									}
									if(opgame5==1) {
										System.out.println("\n Escolhendo a direção errada, você é pego pela avalanche de classes, o poder da magia CRUD é grande...");
										System.out.println("                                                             ,----..\r\n"
												+ "  ,----..                            ____                   /   /   \\\r\n"
												+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
												+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
												+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
												+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
												+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
												+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
												+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
												+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
												+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
												+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
												+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
												+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
												+ "");
									}
									
									if(opgame5==2) {
										System.out.println("\n Você escolheu a direção certa, pulando para a direita e desviando facilmente!"
												+ "\nEntretanto, Malevolus não para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR POSTMAN E SPRING AO MESMO TEMPO"
												+ "\nE agora jovem herói, como irá escapar dessa?"
												+ "\n1 - Desviar para a esquerda."
												+ "\n2 - Desviar para a diretia.");
										opgame6 = leia.nextInt();
										while(opgame6<=0 || opgame6>2) {
											System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
											opgame6 = leia.nextInt();
										}
										if(opgame6==2) {
											System.out.println("\n Escolhendo a direita errada, você é pego pelo travamento infinito e fica para sempre congelado...");
											System.out.println("                                                             ,----..\r\n"
													+ "  ,----..                            ____                   /   /   \\\r\n"
													+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
													+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
													+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
													+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
													+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
													+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
													+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
													+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
													+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
													+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
													+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
													+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
													+ "");
										}
										if(opgame6==1) {
											System.out.println("\nVocê consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperança..."
													+ "\nÉ agora, essa é sua ultima chance de derrotar o poderoso Spring, o que fará?"
													+ "\n1 - Usar a espada!"
													+ "\n2 - Desviar para a esquerda!");
										}
										opgame7 = leia.nextInt();
										while(opgame7<=0 || opgame7>2) {
											System.out.println("\nAtenção, opção invalida, por gentileza, digite novamente: ");
											opgame7 = leia.nextInt();
										}
										if(opgame7==2) {
											System.out.println("\n Apesar de sua velocidade, a magia de Malevolus o atinge o fazendo entrar em desespero...");
											System.out.println("                                                             ,----..\r\n"
													+ "  ,----..                            ____                   /   /   \\\r\n"
													+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
													+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
													+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
													+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
													+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
													+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
													+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
													+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
													+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
													+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
													+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
													+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
													+ "");
										}
										if(opgame7==1) {
											System.out.println("\nCom um movimento forte, você rebate a magia do poderoso Spring o atingindo!"
													+ "\n- Como? Como isso é possível?"
													+ "\nCom um sorriso no rosto, você assiste ao desaparecimento de Malevolus para sempre..."
													+ "\nCom seu dever cumprido, você se retira da caverna sorrindo, olhando o belo por do Sol..."
													+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
													+ "\n'Confie no processo...'"
													+ "\nParabéns "+nome+" você salvou o mundo do desespero e desesperança, todos os habitantes sempre"
													+ "\nirão lembrar do grande herói que um dia os salvou!"
													+ "\nO mundo da Família 36 descansa em uma era de paz mais uma vez!!!");
											System.out.println(" _______  __  .___  ___. \r\n"
													+ "|   ____||  | |   \\/   | \r\n"
													+ "|  |__   |  | |  \\  /  | \r\n"
													+ "|   __|  |  | |  |\\/|  | \r\n"
													+ "|  |     |  | |  |  |  | \r\n"
													+ "|__|     |__| |__|  |__| \r\n"
													+ "                         ");
										}
											
								if(opgame3==2) {
									System.out.println("\n- Criatura insolente!! Sua falta de crença me assusta..."
											+ "\nEm um unico movimento com os cajados, os sábios abrem um buraco negro abaixo de você...");
									System.out.println("                                                             ,----..\r\n"
											+ "  ,----..                            ____                   /   /   \\\r\n"
											+ " /   /   \\                         ,'  , `.                /   .     :\r\n"
											+ "|   :     :                     ,-+-,.' _ |               .   /   ;.  \\                         __  ,-.\r\n"
											+ ".   |  ;. /                  ,-+-. ;   , ||              .   ;   /  ` ;      .---.            ,' ,'/ /|\r\n"
											+ ".   ; /--`      ,--.--.     ,--.'|'   |  ||    ,---.     ;   |  ; \\ ; |    /.  ./|    ,---.   '  | |' |\r\n"
											+ ";   | ;  __    /       \\   |   |  ,', |  |,   /     \\    |   :  | ; | '  .-' . ' |   /     \\  |  |   ,'\r\n"
											+ "|   : |.' .'  .--.  .-. |  |   | /  | |--'   /    /  |   .   |  ' ' ' : /___/ \\: |  /    /  | '  :  /\r\n"
											+ ".   | '_.' :   \\__\\/: . .  |   : |  | ,     .    ' / |   '   ;  \\; /  | .   \\  ' . .    ' / | |  | '\r\n"
											+ "'   ; : \\  |   ,\" .--.; |  |   : |  |/      '   ;   /|    \\   \\  ',  /   \\   \\   ' '   ;   /| ;  : |\r\n"
											+ "'   | '/  .'  /  /  ,.  |  |   | |`-'       '   |  / |     ;   :    /     \\   \\    '   |  / | |  , ;\r\n"
											+ "|   :    /   ;  :   .'   \\ |   ;/           |   :    |      \\   \\ .'       \\   \\ | |   :    |  ---'\r\n"
											+ " \\   \\ .'    |  ,     .-./ '---'             \\   \\  /        `---`          '---\"   \\   \\  /\r\n"
											+ "  `---`       `--`---'                        `----'                                 `----'\r\n"
											+ "");
								}
								
						}
					}
				}
									
			}
			
			break;
		}
				
	}
		
	}




