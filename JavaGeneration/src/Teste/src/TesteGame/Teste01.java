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
				+"\nVoc� est� entrando no mundo da Fam�lia 36, esse lindo planeta bem distante"
				+ "\nde onde voc� vem. Aqui, todos falam javanez e vivem em harmonia nesse mundo magico."
				+ "\nDiante de tantas maravilhas, uma lenda ecoa pelos ouvidos dos seres: "
				+ "\n'Dentro da caverna mais escura, nas profundezas do surto, l� est� esperando..."
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
				+ "\nSer� voc� o escolhide?"
				+ "\nVoc� ser� capaz de salvar nosso mundo das for�as do Banco de Dados e Front End?"
				+ "\nBem, para isso, primeiro eu preciso que voc� se identifique:"
				+ "\nComo voc� prefere ser chamade?"
				+"\n1 - Masculino // 2 - Feminino // 3 - G�nero Neutro");
		op = leia.nextInt();
		while(op<0 || op>3) {
			System.out.println("\nComo voc� prefere ser chamade?"
					+"\n1 - Masculino // 2 - Feminino // 3 - G�nero Neutro");
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
			
			System.out.println("\nEntendo, ent�o jovem cavaleiro, como � o seu nome?");
			nome = leia.next();
			System.out.println("\nPois bem, "+nome+" sua aventura come�a na frente da caverna mais escura do"
					+"\nmundo da Fam�lia 36... Voc� sente um vento g�lido, suas pernas tremem,"
					+ "\nmas voc� retira for�as e adentra aquele ambiente perigoso..."
					+ "\nAtravessando a caverna voc� nota pedras espalhadas pelo local, al�m de manchas"
					+"\nde sangue por toda parte, voc� engole em seco ao perceber o destino"
					+ "\ndos aspirantes anteriores."
					+ "\nCaminhando mais um pouco voc� v� uma luz, uma forte luz..."
					+"\nCorrendo em sua dire��o voc� percebe.");
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
			
			System.out.println("\nVoc� se depara com uma tocha acesa, brilhando intensamente como"
					+"\no Sol na escurid�o do espa�o."
					+"\nApos acender a sua tocha voc� segue seu caminho. Agora com luz"
					+ "\nvoc� pode reparar na caverna de uma forma mais detalhada!"
					+ "\n� poss�vel notar as paredes acinzentadas e estranhamente sim�tricas,"
					+ "\no ch�o banhado pelo liquido da vida de antigos her�is parecia imponente,"
					+ "\ntudo naquele lugar gritava grandeza e perigo."
					+ "\nEm dado momento de sua caminhada, voc� nota que a caverna anteriormente linear"
					+ "\nagora apresentava dois caminhos para seguir... O que far� jovem her�i?"
					+ "\n1 - Esquerda <--- // ---> 2 - Direita");
			opgame = leia.nextInt();
			while(opgame<=0 || opgame>2) {
				System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
				opgame = leia.nextInt();
			}
				if(opgame==1) {
				System.out.println("\nSeguindo pelo caminho da Esquerda, voc� se depara com uma incrivel floresta..."
						+ "\nMas como isso seria poss�vel? Voc� est� dentro de uma caverna..."
						+ "\nMas l� estava ela, bela e imponente, banhada pela luz do luar!"
						+ "\nEra poss�vel ver os animais felizes, as �guas cristalinas, tudo em perfeito estado."
						+ "\nN�o muito distante, voc� pode ver as arvores em um balan�ar diferente..."
						+ "\nE sem qualquer aviso, um grande escorpi�o saltou das arvores e parou em sua frente."
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
				System.out.println("\n- Eu me chamo Eclipse, sou o lendario escorpi�o rei!!!"
						+ "\nPara passar, voc� deve seguir a regra... Aqui, voc� precisa responder uma pergunta!"
						+ "\nQuado um programa � encerrado, os dados s�o salvos nas variaves? Restonda-me criatura inferior...");
				System.out.println();
				System.out.println("\nA voz do escorpi�o era alta, vibrante e agressiva..."
						+ "\nVoc� n�o tinha para onde correr, ele o alcan�aria rapidamente,"
						+ "\nal�m disso voc� n�o acreditava possuir arma que penetrasse tal corpo..."
						+ "\nEnt�o jovem her�i, o que ir� fazer? O que ir� responder?"
						+ "\n1 - N�o grande Eclipse!"
						+ "\n2 - N�o quero saber, eu vou passar!");
				
				opgame2 = leia.nextInt();
				while(opgame2<=0 || opgame2>2) {
					System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
					opgame2 = leia.nextInt();
				}
					if(opgame2==1) {
						System.out.println("\nMuito bem guerreiro, pode passar!");
						System.out.println("\nO grande escorpi�o abre espa�o e finalmente voc� pode avan�ar!"
								+ "\nPassando pela floresta, voc� chega a um grande port�o, que ao abrir,"
								+ "\nVoc� se depara com uma grande sala, cheia de pastas, no centro,"
								+ "\nVoc� pode ver um senhor organizando todas as pastas..."
								+ "\n- Parab�ns jovem her�i, falta pouco! Eu me chamo Rafael, o s�bio do BACK END...");
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
						System.out.println("\n- Para passar voc� deve responder a mais um teste..."
								+ "\n- Complete a palavra: *o**m**"
								+ "\n1 - Mosaico"
								+ "\n2 - Postman"
								+ "\n3 - Gomamon");
						opgame4 = leia.nextInt();
						while(opgame4<=0 || opgame4>3) {
							System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
							opgame4 = leia.nextInt();
						}
						if(opgame4==1) {
							System.out.println("\n- � uma pena, mas seus conhecimentos n�o s�o o suficiente, quem sabe na pr�xima...");
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
							System.out.println("\n- � uma pena, mas seus conhecimentos n�o s�o o suficiente, quem sabe na pr�xima...");
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
							System.out.println("\n- Muito bem, jovem her�i, voc� pode avan�ar agora, provou seu conhecimento!");
							System.out.println("\n Passando pelo s�bio voc� atravessa um grande corredor e abre a porta no final do mesmo..."
									+ "voc� � recebido com uma poderosa luz e anjos cantando!"
									+ "\nVoc� adentra uma grande sala dourada, brilhante e vazia..."
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
							System.out.println("\nFinalmente voc� conseguiu!!! Conquistou a espada lendaria!!!"
									+ "\nA Diamound Dust � sua! Mas lembre-se..."
									+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
									+ "\nPortanto, seu dever agora � usar da espada para proteger o mundo"
									+ "\nda Fam�lia 36!"
									+ "\nBoa sorte "+nome+" sua verdadeira batalha come�a agora!"
									+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
									+ "\nOlhos vermelhos s�o vistos na escurid�o, voc� sentia, ali estava ele, Malevolus, o Spring!");
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
							System.out.println("\n- Vejo que chegou bem longe jovem, por�m, tudo termina aqui...");
							System.out.println("\nA voz de Malevolus era amea�adora, Coberto por seu manto, o mesmo"
									+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
									+ "\nO que voc� far�?"
									+ "\n1 - Desviar para a esquerda."
									+ "\n2 - Desviar para a diretia.");
							opgame5 = leia.nextInt();
							while(opgame5<=0 || opgame5>2) {
								System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
								opgame5 = leia.nextInt();
							}
							if(opgame5==2) {
								System.out.println("\n Escolhendo a dire��o errada, voc� � pego pela avalanche de classes, o poder da magia CRUD � grande...");
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
								System.out.println("\n Voc� escolheu a dire��o certa, pulando para a esquerda e desviando facilmente!"
										+ "\nEntretanto, Malevolus n�o para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR POSTMAN E SPRING AO MESMO TEMPO"
										+ "\nE agora jovem her�i, como ir� escapar dessa?"
										+ "\n1 - Desviar para a esquerda."
										+ "\n2 - Desviar para a diretia.");
								opgame6 = leia.nextInt();
								while(opgame6<=0 || opgame6>2) {
									System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
									opgame6 = leia.nextInt();
								}
								if(opgame6==1) {
									System.out.println("\n Escolhendo a esquerda errada, voc� � pego pelo travamento infinito e fica para sempre congelado...");
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
									System.out.println("\nVoc� consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperan�a..."
											+ "\n� agora, essa � sua ultima chance de derrotar o poderoso Spring, o que far�?"
											+ "\n1 - Usar a espada!"
											+ "\n2 - Desviar para a esquerda!");
								}
								opgame7 = leia.nextInt();
								while(opgame7<=0 || opgame7>2) {
									System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
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
									System.out.println("\nCom um movimento forte, voc� rebate a magia do poderoso Spring o atingindo!"
											+ "\n- Como? Como isso � poss�vel?"
											+ "\nCom um sorriso no rosto, voc� assiste ao desaparecimento de Malevolus para sempre..."
											+ "\nCom seu dever cumprido, voc� se retira da caverna sorrindo, olhando o belo por do Sol..."
											+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
											+ "\n'Confie no processo...'"
											+ "\nParab�ns "+nome+" voc� salvou o mundo do desespero e desesperan�a, todos os habitantes sempre"
											+ "\nir�o lembrar do grande her�i que um dia os salvou!"
											+ "\nO mundo da Fam�lia 36 descansa em uma era de paz mais uma vez!!!");
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
								+ "\nEm um unico movimento com a calda, o escorpi�o ataca com toda sua furia...");
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
					System.out.println("\nDecidindo pela Direita, voc� segue seu caminho arduamente"
							+ "\nat� chegar a uma grande biblioteca, lotada de todos os livros poss�veis."
							+ "\nAdentrando o local voc� percebe um senhor, olhando fixamente para voc�,"
							+ "\nEle vestia um manto e chap�u, alem de segurar um cajado."
							+ "\nA seu lado, uma senhora com a mesma vestimenta distraida com a imagem"
							+ "\nde uma crian�a em um livro.");
					
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
					
					System.out.println("\n- J� sei o que veio buscar, jovem viajante, Eu me chamo Luis."
							+ "\nSou o s�bio do JAVA.");
					System.out.println("\nA voz do senhor era potente, poderia ecoar por todo planeta.");
					System.out.println("\n- Eu me chamo J�ssica, mas pode me chamar de Tia Jess, a s�bia do FRONT END.");
					System.out.println("\nA senhora se apresenta, finamente notando sua presen�a.");
					System.out.println("\n- Para conseguir a espada voc� s� precisa responder a uma pergunta...");
					System.out.println("\nO senhor comentava de forma sorridente, er� visivel que ele gostava"
							+ "\nde suas perguntas!");
					System.out.println("- Um passarinho caiu do ninho de uma arvore..."
							+ "\nComo uma forma de sobreviver, o mesmo come�o a bater as asinhas para tentar voar..."
							+ "\nPorem, o passarinho nunca havia voado antes..."
							+ "\nEle ir� conseguir?"
							+ "\n1 - VAI DAR BOM!!!"
							+ "\n2 - Acho que n�o...");
					opgame3 = leia.nextInt();
					while(opgame3<=0 || opgame3>2) {
						System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
						opgame3 = leia.nextInt();
					}
						if(opgame3==1) {
							System.out.println("\nMuito bem guerreiro, pode passar!");
							System.out.println("\nOs dois s�bios abrem espa�o e finalmente voc� pode avan�ar!"
									+ "\nPassando pela biblioteca, voc� chega a um grande port�o, que ao abrir,"
									+ "\nVoc� adentra a um teatro, completamente cheio de monitores."
									+ "\nNo palco, voc� observa um livro murmurando...");
							System.out.println("Gerar arte ASCII\r\n"
									+ "Dowloadc�pia de\r\n"
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
							System.out.println("\n- Seja bem vindo ao teste final, her�i... Meu nome � Documenta��o, a boa pratica..."
									+ "\n- Meu questionamento � simples..."
									+ "\nA voz do livro era calma, quase sem emo��o."
									+ "\n- Os primeiros sistemas possuiam documenta��o?"
									+ "\n1 - Sim."
									+ "\n2 - N�o.");
							opgame8 = leia.nextInt();
							while(opgame8<=0 || opgame8>2) {
								System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
								opgame3 = leia.nextInt();
							}
							if(opgame8==1) {
								System.out.println("\n- Claro... Voc� est� errado..."
										+ "\nO livro sem emo��o brilha intensamente apos seu decreto e"
										+ "\ndemonstrando todo seu poder, o mesmo cresce..."
										+ "\nAgora, t�o grande quando o teatro, em um unico movimento ele engole"
										+ "\nvoc� de forma abrupta!");
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
							System.out.println("\n- Muito bem, voc� pode passar..."
									+ "O livro apenas se fecha, abrindo passagem para voc�, que ao seguir pelo teatro"
									+ "\nse depara com uma grande porta dourada."
									+ "\nDestemido, voc� abre a porta em um unico movimento!"
									+ "\nUma poderosa luz e anjos cantando o recebe!"
									+ "\nVoc� adentra uma grande sala dourada, brilhante e vazia..."
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
							System.out.println("\nFinalmente voc� conseguiu!!! Conquistou a espada lendaria!!!"
									+ "\nA Diamound Dust � sua! Mas lembre-se..."
									+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
									+ "\nPortanto, seu dever agora � usar da espada para proteger o mundo"
									+ "\nda Fam�lia 36!"
									+ "\nBoa sorte "+nome+" sua verdadeira batalha come�a agora!"
									+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
									+ "\nOlhos vermelhos s�o vistos na escurid�o, voc� sentia, ali estava ele, Malevolus, o Spring!");
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
							System.out.println("\n- Vejo que chegou bem longe jovem, por�m, tudo termina aqui...");
							System.out.println("\nA voz de Malevolus era amea�adora, Coberto por seu manto, o mesmo"
									+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
									+ "\nO que voc� far�?"
									+ "\n1 - Desviar para a esquerda."
									+ "\n2 - Desviar para a diretia.");
							opgame5 = leia.nextInt();
							while(opgame5<=0 || opgame5>2) {
								System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
								opgame5 = leia.nextInt();
							}
							if(opgame5==1) {
								System.out.println("\n Escolhendo a dire��o errada, voc� � pego pela avalanche de classes, o poder da magia CRUD � grande...");
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
								System.out.println("\n Voc� escolheu a dire��o certa, pulando para a direita e desviando facilmente!"
										+ "\nEntretanto, Malevolus n�o para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR POSTMAN E SPRING AO MESMO TEMPO"
										+ "\nE agora jovem her�i, como ir� escapar dessa?"
										+ "\n1 - Desviar para a esquerda."
										+ "\n2 - Desviar para a diretia.");
								opgame6 = leia.nextInt();
								while(opgame6<=0 || opgame6>2) {
									System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
									opgame6 = leia.nextInt();
								}
								if(opgame6==2) {
									System.out.println("\n Escolhendo a direita errada, voc� � pego pelo travamento infinito e fica para sempre congelado...");
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
									System.out.println("\nVoc� consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperan�a..."
											+ "\n� agora, essa � sua ultima chance de derrotar o poderoso Spring, o que far�?"
											+ "\n1 - Usar a espada!"
											+ "\n2 - Desviar para a esquerda!");
								}
								opgame7 = leia.nextInt();
								while(opgame7<=0 || opgame7>2) {
									System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
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
									System.out.println("\nCom um movimento forte, voc� rebate a magia do poderoso Spring o atingindo!"
											+ "\n- Como? Como isso � poss�vel?"
											+ "\nCom um sorriso no rosto, voc� assiste ao desaparecimento de Malevolus para sempre..."
											+ "\nCom seu dever cumprido, voc� se retira da caverna sorrindo, olhando o belo por do Sol..."
											+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
											+ "\n'Confie no processo...'"
											+ "\nParab�ns "+nome+" voc� salvou o mundo do desespero e desesperan�a, todos os habitantes sempre"
											+ "\nir�o lembrar do grande her�i que um dia os salvou!"
											+ "\nO mundo da Fam�lia 36 descansa em uma era de paz mais uma vez!!!");
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
							System.out.println("\n- Homem insolente!! Sua falta de cren�a me assusta..."
									+ "\nEm um unico movimento com os cajados, os s�bios abrem um buraco negro abaixo de voc�...");
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
				
				System.out.println("\nEntendo, ent�o jovem guerreira, como � o seu nome?");
				nome = leia.next();
				System.out.println("\nPois bem, "+nome+" sua aventura come�a na frente da caverna mais escura do"
						+"\nmundo da Fam�lia 36... Voc� sente um vento g�lido vindo de dentro, suas pernas tremem,"
						+ "\nmas voc� retira for�as e adentra aquele ambiente perigoso..."
						+ "\nAtravessando a caverna voc� nota pedras espalhadas pelo local, al�m de manchas"
						+"\nde sangue por toda parte, voc� engole em seco ao perceber o destino"
						+ "\ndos aspirantes anteriores."
						+ "\nCaminhando mais um pouco voc� v� uma luz, uma forte luz..."
						+"\nCorrendo em sua dire��o voc� percebe.");
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
				
				System.out.println("\nVoc� se depara com uma tocha acesa, brilhando intensamente como\"\r\n"
						+ "\no Sol na escurid�o do espa�o.\"\r\n"
						+ "\nApos acender a sua tocha voc� segue seu caminho. Agora com luz\"\r\n"
						+ "\nvoc� pode reparar na caverna de uma forma mais detalhada!\"\r\n"
						+ "\n� poss�vel notar as paredes acinzentadas e estranhamente sim�tricas,\"\r\n"
						+ "\no ch�o banhado pelo liquido da vida de antigos her�is parecia imponente,\"\r\n"
						+ "\ntudo naquele lugar gritava grandeza e perigo.\"\r\n"
						+ "\nEm dado momento de sua caminhada, voc� nota que a caverna anteriormente linear\"\r\n"
						+ "\nagora apresentava dois caminhos para seguir... O que far� jovem hero�na?"
						+ "\n1 - Esquerda <--- // ---> 2 - Direita");
				opgame = leia.nextInt();
				while(opgame<=0 || opgame>2) {
					System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
					opgame = leia.nextInt();
				}
					if(opgame==1) {
					System.out.println("\nSeguindo pelo caminho da Esquerda, voc� se depara com uma incrivel floresta..."
							+ "\nMas como isso seria poss�vel? Voc� est� dentro de uma caverna..."
							+ "\nMas l� estava ela, bela e imponente, banhada pela luz do luar!"
							+ "\nEra poss�vel ver os animais felizes, as �guas cristalinas, tudo em perfeito estado."
							+ "\nN�o muito distante, voc� pode ver as arvores em um balan�ar diferente..."
							+ "\nE sem qualquer aviso, um grande escorpi�o saltou das arvores e parou em sua frente."
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
					System.out.println("\n- Eu me chamo Eclipse, sou o lendario escorpi�o rei!!!"
							+ "\nPara passar, voc� deve seguir a regra... Aqui, voc� precisa responder uma pergunta!"
							+ "\nQuado um programa � encerrado, os dados s�o salvos nas variaves? Restonda-me criatura inferior...");
					System.out.println();
					System.out.println("\nA voz do escorpi�o era alta, vibrante e agressiva..."
							+ "\nVoc� n�o tinha para onde correr, ele o alcan�aria rapidamente,"
							+ "\nal�m disso voc� n�o acreditava possuir arma que penetrasse tal corpo..."
							+ "\nEnt�o jovem hero�na, o que ir� fazer? O que ir� responder?"
							+ "\n1 - N�o grande Eclipse!"
							+ "\n2 - N�o quero saber, eu vou passar!");
					
					opgame2 = leia.nextInt();
					while(opgame2<=0 || opgame2>2) {
						System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
						opgame2 = leia.nextInt();
					}
						if(opgame2==1) {
							System.out.println("\nMuito bem guerreira, pode passar!");
							System.out.println("\nO grande escorpi�o abre espa�o e finalmente voc� pode avan�ar!"
									+ "\nPassando pela floresta, voc� chega a um grande port�o, que ao abrir,"
									+ "\nVoc� se depara com uma grande sala, cheia de pastas, no centro,"
									+ "\nVoc� pode ver um senhor organizando todas as pastas..."
									+ "\n- Parab�ns jovem hero�na, falta pouco! Eu me chamo Rafael, o s�bio do BACK END...");
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
							System.out.println("\n- Para passar voc� deve responder a mais um teste..."
									+ "\n- Complete a palavra: *o**m**"
									+ "\n1 - Mosaico"
									+ "\n2 - Postman"
									+ "\n3 - Gomamon");
							opgame4 = leia.nextInt();
							while(opgame4<=0 || opgame4>3) {
								System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
								opgame4 = leia.nextInt();
							}
							if(opgame4==1) {
								System.out.println("\n- � uma pena, mas seus conhecimentos n�o s�o o suficiente, quem sabe na pr�xima...");
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
								System.out.println("\n- � uma pena, mas seus conhecimentos n�o s�o o suficiente, quem sabe na pr�xima...");
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
								System.out.println("\n- Muito bem, jovem hero�na, voc� pode avan�ar agora, provou seu conhecimento!");
								System.out.println("\n Passando pelo s�bio voc� atravessa um grande corredor e abre a porta no final do mesmo..."
										+ "voc� � recebido com uma poderosa luz e anjos cantando!"
										+ "\nVoc� adentra uma grande sala dourada, brilhante e vazia..."
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
								System.out.println("\nFinalmente voc� conseguiu!!! Conquistou a espada lendaria!!!"
										+ "\nA Diamound Dust � sua! Mas lembre-se..."
										+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
										+ "\nPortanto, seu dever agora � usar da espada para proteger o mundo"
										+ "\nda Fam�lia 36!"
										+ "\nBoa sorte "+nome+" sua verdadeira batalha come�a agora!"
										+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
										+ "\nOlhos vermelhos s�o vistos na escurid�o, voc� sentia, ali estava ele, Malevolus, o Spring!");
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
								System.out.println("\n- Vejo que chegou bem longe jovem, por�m, tudo termina aqui...");
								System.out.println("\nA voz de Malevolus era amea�adora, Coberto por seu manto, o mesmo"
										+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
										+ "\nO que voc� far�?"
										+ "\n1 - Desviar para a esquerda."
										+ "\n2 - Desviar para a diretia.");
								opgame5 = leia.nextInt();
								while(opgame5<=0 || opgame5>2) {
									System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
									opgame5 = leia.nextInt();
								}
								if(opgame5==2) {
									System.out.println("\n Escolhendo a dire��o errada, voc� � pega pela avalanche de classes, o poder da magia CRUD � grande...");
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
									System.out.println("\n Voc� escolheu a dire��o certa, pulando para a esquerda e desviando facilmente!"
											+ "\nEntretanto, Malevolus n�o para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR O POSTMAN E SPRING AO MESMO TEMPO"
											+ "\nE agora jovem hero�na, como ir� escapar dessa?"
											+ "\n1 - Desviar para a esquerda."
											+ "\n2 - Desviar para a diretia.");
									opgame6 = leia.nextInt();
									while(opgame6<=0 || opgame6>2) {
										System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
										opgame6 = leia.nextInt();
									}
									if(opgame6==1) {
										System.out.println("\n Escolhendo a esquerda errada, voc� � pega pelo travamento infinito e fica para sempre congelada...");
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
										System.out.println("\nVoc� consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperan�a..."
												+ "\n� agora, essa � sua ultima chance de derrotar o poderoso Spring, o que far�?"
												+ "\n1 - Usar a espada!"
												+ "\n2 - Desviar para a esquerda!");
									}
									opgame7 = leia.nextInt();
									while(opgame7<=0 || opgame7>2) {
										System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
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
										System.out.println("\nCom um movimento forte, voc� rebate a magia do poderoso Spring o atingindo!"
												+ "\n- Como? Como isso � poss�vel?"
												+ "\nCom um sorriso no rosto, voc� assiste ao desaparecimento de Malevolus para sempre..."
												+ "\nCom seu dever cumprido, voc� se retira da caverna sorrindo, olhando o belo por do Sol..."
												+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
												+ "\n'Confie no processo...'"
												+ "\nParab�ns "+nome+" voc� salvou o mundo do desespero e desesperan�a, todos os habitantes sempre"
												+ "\nir�o lembrar da grande hero�na que um dia os salvou!"
												+ "\nO mundo da Fam�lia 36 descansa em uma era de paz mais uma vez!!!");
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
									+ "\nEm um unico movimento com a calda, o escorpi�o ataca com toda sua furia...");
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
						System.out.println("\nDecidindo pela Direita, voc� segue seu caminho arduamente"
								+ "\nat� chegar a uma grande biblioteca, lotada de todos os livros poss�veis."
								+ "\nAdentrando o local voc� percebe um senhor, olhando fixamente para voc�,"
								+ "\nEle vestia um manto e chap�u, alem de segurar um cajado."
								+ "\nA seu lado, uma senhora com a mesma vestimenta distraida com a imagem"
								+ "\nde uma crian�a em um livro.");
						
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
						
						System.out.println("\n- J� sei o que veio buscar, jovem viajante, Eu me chamo Luis."
								+ "\nSou o s�bio do JAVA.");
						System.out.println("\nA voz do senhor era potente, poderia ecoar por todo planeta.");
						System.out.println("\n- Eu me chamo J�ssica, mas pode me chamar de Tia Jess, a s�bia do FRONT END.");
						System.out.println("\nA senhora se apresenta, finamente notando sua presen�a.");
						System.out.println("\n- Para conseguir a espada voc� s� precisa responder a uma pergunta...");
						System.out.println("\nO senhor comentava de forma sorridente, er� visivel que ele gostava"
								+ "\nde suas perguntas!");
						System.out.println("- Um passarinho caiu do ninho de uma arvore..."
								+ "\nComo uma forma de sobreviver, o mesmo come�o a bater as asinhas para tentar voar..."
								+ "\nPorem, o passarinho nunca havia voado antes..."
								+ "\nEle ir� conseguir?"
								+ "\n1 - VAI DAR BOM!!!"
								+ "\n2 - Acho que n�o...");
						opgame3 = leia.nextInt();
						while(opgame3<=0 || opgame3>2) {
							System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
							opgame3 = leia.nextInt();
						}
							if(opgame3==1) {
								System.out.println("\nMuito bem guerreira, pode passar!");
								System.out.println("\nOs dois s�bios abrem espa�o e finalmente voc� pode avan�ar!"
										+ "\nPassando pela biblioteca, voc� chega a um grande port�o, que ao abrir,"
										+ "\nVoc� adentra a um teatro, completamente cheio de monitores."
										+ "\nNo palco, voc� observa um livro murmurando...");
								System.out.println("Gerar arte ASCII\r\n"
										+ "Dowloadc�pia de\r\n"
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
								System.out.println("\n- Seja bem vindo ao teste final, hero�na... Meu nome � Documenta��o, a boa pratica..."
										+ "\n- Meu questionamento � simples..."
										+ "\nA voz do livro era calma, quase sem emo��o."
										+ "\n- Os primeiros sistemas possuiam documenta��o?"
										+ "\n1 - Sim."
										+ "\n2 - N�o.");
								opgame8 = leia.nextInt();
								while(opgame8<=0 || opgame8>2) {
									System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
									opgame8 = leia.nextInt();
								}
								if(opgame8==1) {
									System.out.println("\n- Claro... Voc� est� errada..."
											+ "\nO livro sem emo��o brilha intensamente apos seu decreto e"
											+ "\ndemonstrando todo seu poder, o mesmo cresce..."
											+ "\nAgora, t�o grande quando o teatro, em um unico movimento ele engole"
											+ "\nvoc� de forma abrupta!");
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
								System.out.println("\n- Muito bem, voc� pode passar..."
										+ "O livro apenas se fecha, abrindo passagem para voc�, que ao seguir pelo teatro"
										+ "\nse depara com uma grande porta dourada."
										+ "\nDestemido, voc� abre a porta em um unico movimento!"
										+ "\nUma poderosa luz e anjos cantando o recebe!"
										+ "\nVoc� adentra uma grande sala dourada, brilhante e vazia..."
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
								System.out.println("\nFinalmente voc� conseguiu!!! Conquistou a espada lendaria!!!"
										+ "\nA Diamound Dust � sua! Mas lembre-se..."
										+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
										+ "\nPortanto, seu dever agora � usar da espada para proteger o mundo"
										+ "\nda Fam�lia 36!"
										+ "\nBoa sorte "+nome+" sua verdadeira batalha come�a agora!"
										+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
										+ "\nOlhos vermelhos s�o vistos na escurid�o, voc� sentia, ali estava ele, Malevolus, o Spring!");
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
								System.out.println("\n- Vejo que chegou bem longe jovem, por�m, tudo termina aqui...");
								System.out.println("\nA voz de Malevolus era amea�adora, Coberto por seu manto, o mesmo"
										+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
										+ "\nO que voc� far�?"
										+ "\n1 - Desviar para a esquerda."
										+ "\n2 - Desviar para a diretia.");
								opgame5 = leia.nextInt();
								while(opgame5<=0 || opgame5>2) {
									System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
									opgame5 = leia.nextInt();
								}
								if(opgame5==1) {
									System.out.println("\n Escolhendo a dire��o errada, voc� � pega pela avalanche de classes, o poder da magia CRUD � grande...");
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
									System.out.println("\n Voc� escolheu a dire��o certa, pulando para a direita e desviando facilmente!"
											+ "\nEntretanto, Malevolus n�o para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR O POSTMAN E SPRING AO MESMO TEMPO"
											+ "\nE agora jovem hero�na, como ir� escapar dessa?"
											+ "\n1 - Desviar para a esquerda."
											+ "\n2 - Desviar para a diretia.");
									opgame6 = leia.nextInt();
									while(opgame6<=0 || opgame6>2) {
										System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
										opgame6 = leia.nextInt();
									}
									if(opgame6==2) {
										System.out.println("\n Escolhendo a direita errada, voc� � pega pelo travamento infinito e fica para sempre congelada...");
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
										System.out.println("\nVoc� consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperan�a..."
												+ "\n� agora, essa � sua ultima chance de derrotar o poderoso Spring, o que far�?"
												+ "\n1 - Usar a espada!"
												+ "\n2 - Desviar para a esquerda!");
									}
									opgame7 = leia.nextInt();
									while(opgame7<=0 || opgame7>2) {
										System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
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
										System.out.println("\nCom um movimento forte, voc� rebate a magia do poderoso Spring o atingindo!"
												+ "\n- Como? Como isso � poss�vel?"
												+ "\nCom um sorriso no rosto, voc� assiste ao desaparecimento de Malevolus para sempre..."
												+ "\nCom seu dever cumprido, voc� se retira da caverna sorrindo, olhando o belo por do Sol..."
												+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
												+ "\n'Confie no processo...'"
												+ "\nParab�ns "+nome+" voc� salvou o mundo do desespero e desesperan�a, todos os habitantes sempre"
												+ "\nir�o lembrar do grande hero�na que um dia os salvou!"
												+ "\nO mundo da Fam�lia 36 descansa em uma era de paz mais uma vez!!!");
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
									System.out.println("\n- Mulher insolente!! Sua falta de cren�a me assusta..."
											+ "\nEm um unico movimento com os cajados, os s�bios abrem um buraco negro abaixo de voc�...");
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
					
					System.out.println("\nEntendo, ent�o jovem Heroine, como � o seu nome?");
					nome = leia.next();
					System.out.println("\nPois bem, "+nome+" sua aventura come�a na frente da caverna mais escura do"
							+"\nmundo da Fam�lia 36... Voc� sente um vento g�lido vindo de dentro, suas pernas tremem,"
							+ "\nmas voc� retira for�as e adentra aquele ambiente perigoso..."
							+ "\nAtravessando a caverna voc� nota pedras espalhadas pelo local, al�m de manchas"
							+"\nde sangue por toda parte, voc� engole em seco ao perceber o destino"
							+ "\ndos aspirantes anteriores."
							+ "\nCaminhando mais um pouco voc� v� uma luz, uma forte luz..."
							+"\nCorrendo em sua dire��o voc� percebe.");
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
					
					System.out.println("\nVoc� se depara com uma tocha acesa, brilhando intensamente como\"\r\n"
							+ "\no Sol na escurid�o do espa�o.\"\r\n"
							+ "\nApos acender a sua tocha voc� segue seu caminho. Agora com luz\"\r\n"
							+ "\nvoc� pode reparar na caverna de uma forma mais detalhada!\"\r\n"
							+ "\n� poss�vel notar as paredes acinzentadas e estranhamente sim�tricas,\"\r\n"
							+ "\no ch�o banhado pelo liquido da vida de antigos her�is parecia imponente,\"\r\n"
							+ "\ntudo naquele lugar gritava grandeza e perigo.\"\r\n"
							+ "\nEm dado momento de sua caminhada, voc� nota que a caverna anteriormente linear\"\r\n"
							+ "\nagora apresentava dois caminhos para seguir... Qual caminho gostaria de seguir?"
							+ "\n1 - Esquerda <--- // ---> 2 - Direita");
					opgame = leia.nextInt();
					while(opgame<=0 || opgame>2) {
						System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
						opgame = leia.nextInt();
					}
						if(opgame==1) {
						System.out.println("\nSeguindo pelo caminho da Esquerda, voc� se depara com uma incrivel floresta..."
								+ "\nMas como isso seria poss�vel? Voc� est� dentro de uma caverna..."
								+ "\nMas l� estava ela, bela e imponente, banhada pela luz do luar!"
								+ "\nEra poss�vel ver os animais felizes, as �guas cristalinas, tudo em perfeito estado."
								+ "\nN�o muito distante, voc� pode ver as arvores em um balan�ar diferente..."
								+ "\nE sem qualquer aviso, um grande escorpi�o saltou das arvores e parou em sua frente."
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
						System.out.println("\n- Eu me chamo Eclipse, sou o lendario escorpi�o rei!!!"
								+ "\nPara passar, voc� deve seguir a regra... Aqui, voc� precisa responder uma pergunta!"
								+ "\nQuado um programa � encerrado, os dados s�o salvos nas variaves? Restonda-me criatura inferior...");
						System.out.println();
						System.out.println("\nA voz do escorpi�o era alta, vibrante e agressiva..."
								+ "\nVoc� n�o tinha para onde correr, ele o alcan�aria rapidamente,"
								+ "\nal�m disso voc� n�o acreditava possuir arma que penetrasse tal corpo..."
								+ "\nEnt�o jovem heroine, o que ir� fazer? O que ir� responder?"
								+ "\n1 - N�o grande Eclipse!"
								+ "\n2 - N�o quero saber, eu vou passar!");
						
						opgame2 = leia.nextInt();
						while(opgame2<=0 || opgame2>2) {
							System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
							opgame2 = leia.nextInt();
						}
							if(opgame2==1) {
								System.out.println("\nMuito bem heroine, pode passar!");
								System.out.println("\nO grande escorpi�o abre espa�o e finalmente voc� pode avan�ar!"
										+ "\nPassando pela floresta, voc� chega a um grande port�o, que ao abrir,"
										+ "\nVoc� se depara com uma grande sala, cheia de pastas, no centro,"
										+ "\nVoc� pode ver um senhor organizando todas as pastas..."
										+ "\n- Parab�ns jovem heroine, falta pouco! Eu me chamo Rafael, o s�bio do BACK END...");
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
								System.out.println("\n- Para passar voc� deve responder a mais um teste..."
										+ "\n- Complete a palavra: *o**m**"
										+ "\n1 - Mosaico"
										+ "\n2 - Postman"
										+ "\n3 - Gomamon");
								opgame4 = leia.nextInt();
								while(opgame4<=0 || opgame4>3) {
									System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
									opgame4 = leia.nextInt();
								}
								if(opgame4==1) {
									System.out.println("\n- � uma pena, mas seus conhecimentos n�o s�o o suficiente, quem sabe na pr�xima...");
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
									System.out.println("\n- � uma pena, mas seus conhecimentos n�o s�o o suficiente, quem sabe na pr�xima...");
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
									System.out.println("\n- Muito bem, jovem heroine, voc� pode avan�ar agora, provou seu conhecimento!");
									System.out.println("\n Passando pelo s�bio voc� atravessa um grande corredor e abre a porta no final do mesmo..."
											+ "voc� � recebido com uma poderosa luz e anjos cantando!"
											+ "\nVoc� adentra uma grande sala dourada, brilhante e vazia..."
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
									System.out.println("\nFinalmente voc� conseguiu!!! Conquistou a espada lendaria!!!"
											+ "\nA Diamound Dust � sua! Mas lembre-se..."
											+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
											+ "\nPortanto, seu dever agora � usar da espada para proteger o mundo"
											+ "\nda Fam�lia 36!"
											+ "\nBoa sorte "+nome+" sua verdadeira batalha come�a agora!"
											+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
											+ "\nOlhos vermelhos s�o vistos na escurid�o, voc� sentia, ali estava ele, Malevolus, o Spring!");
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
									System.out.println("\n- Vejo que chegou bem longe jovem, por�m, tudo termina aqui...");
									System.out.println("\nA voz de Malevolus era amea�adora, Coberto por seu manto, o mesmo"
											+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
											+ "\nO que voc� far�?"
											+ "\n1 - Desviar para a esquerda."
											+ "\n2 - Desviar para a diretia.");
									opgame5 = leia.nextInt();
									while(opgame5<=0 || opgame5>2) {
										System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
										opgame5 = leia.nextInt();
									}
									if(opgame5==2) {
										System.out.println("\n Escolhendo a dire��o errada, voc� recebe a avalanche de classes, o poder da magia CRUD � grande...");
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
										System.out.println("\n Voc� escolheu a dire��o certa, pulando para a esquerda e desviando facilmente!"
												+ "\nEntretanto, Malevolus n�o para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR POSTMAN E SPRING AO MESMO TEMPO"
												+ "\nE agora jovem heroine, como ir� escapar dessa?"
												+ "\n1 - Desviar para a esquerda."
												+ "\n2 - Desviar para a diretia.");
										opgame6 = leia.nextInt();
										while(opgame6<=0 || opgame6>2) {
											System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
											opgame6 = leia.nextInt();
										}
										if(opgame6==1) {
											System.out.println("\n Escolhendo a esquerda errada, voc� recebe o travamento infinito e fica para sempre congelade...");
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
											System.out.println("\nVoc� consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperan�a..."
													+ "\n� agora, essa � sua ultima chance de derrotar o poderoso Spring, o que far�?"
													+ "\n1 - Usar a espada!"
													+ "\n2 - Desviar para a esquerda!");
										}
										opgame7 = leia.nextInt();
										while(opgame7<=0 || opgame7>2) {
											System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
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
											System.out.println("\nCom um movimento forte, voc� rebate a magia do poderoso Spring o atingindo!"
													+ "\n- Como? Como isso � poss�vel?"
													+ "\nCom um sorriso no rosto, voc� assiste ao desaparecimento de Malevolus para sempre..."
													+ "\nCom seu dever cumprido, voc� se retira da caverna sorrindo, olhando o belo por do Sol..."
													+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
													+ "\n'Confie no processo...'"
													+ "\nParab�ns "+nome+" voc� salvou o mundo do desespero e desesperan�a, todos os habitantes sempre"
													+ "\nir�o lembrar quem um dia os salvou!"
													+ "\nO mundo da Fam�lia 36 descansa em uma era de paz mais uma vez!!!");
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
										+ "\nEm um unico movimento com a calda, o escorpi�o ataca com toda sua furia...");
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
							System.out.println("\nDecidindo pela Direita, voc� segue seu caminho arduamente"
									+ "\nat� chegar a uma grande biblioteca, lotada de todos os livros poss�veis."
									+ "\nAdentrando o local voc� percebe um senhor, olhando fixamente para voc�,"
									+ "\nEle vestia um manto e chap�u, alem de segurar um cajado."
									+ "\nA seu lado, uma senhora com a mesma vestimenta distraida com a imagem"
									+ "\nde uma crian�a em um livro.");
							
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
							
							System.out.println("\n- J� sei o que veio buscar, jovem viajante, Eu me chamo Luis."
									+ "\nSou o s�bio do JAVA.");
							System.out.println("\nA voz do senhor era potente, poderia ecoar por todo planeta.");
							System.out.println("\n- Eu me chamo J�ssica, mas pode me chamar de Tia Jess, a s�bia do FRONT END.");
							System.out.println("\nA senhora se apresenta, finamente notando sua presen�a.");
							System.out.println("\n- Para conseguir a espada voc� s� precisa responder a uma pergunta...");
							System.out.println("\nO senhor comentava de forma sorridente, er� visivel que ele gostava"
									+ "\nde suas perguntas!");
							System.out.println("- Um passarinho caiu do ninho de uma arvore..."
									+ "\nComo uma forma de sobreviver, o mesmo come�o a bater as asinhas para tentar voar..."
									+ "\nPorem, o passarinho nunca havia voado antes..."
									+ "\nEle ir� conseguir?"
									+ "\n1 - VAI DAR BOM!!!"
									+ "\n2 - Acho que n�o...");
							opgame3 = leia.nextInt();
							while(opgame3<=0 || opgame3>2) {
								System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
								opgame3 = leia.nextInt();
							}
								if(opgame3==1) {
									System.out.println("\nMuito bem heroine, pode passar!");
									System.out.println("\nOs dois s�bios abrem espa�o e finalmente voc� pode avan�ar!"
											+ "\nPassando pela biblioteca, voc� chega a um grande port�o, que ao abrir,"
											+ "\nVoc� adentra a um teatro, completamente cheio de monitores."
											+ "\nNo palco, voc� observa um livro murmurando...");
									System.out.println("Gerar arte ASCII\r\n"
											+ "Dowloadc�pia de\r\n"
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
									System.out.println("\n- Seja bem vindo ao teste final, heroine... Meu nome � Documenta��o, a boa pratica..."
											+ "\n- Meu questionamento � simples..."
											+ "\nA voz do livro era calma, quase sem emo��o."
											+ "\n- Os primeiros sistemas possuiam documenta��o?"
											+ "\n1 - Sim."
											+ "\n2 - N�o.");
									opgame8 = leia.nextInt();
									while(opgame8<=0 || opgame8>2) {
										System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
										opgame3 = leia.nextInt();
									}
									if(opgame8==1) {
										System.out.println("\n- Claro... Voc� est� errade..."
												+ "\nO livro sem emo��o brilha intensamente apos seu decreto e"
												+ "\ndemonstrando todo seu poder, o mesmo cresce..."
												+ "\nAgora, t�o grande quando o teatro, em um unico movimento ele engole"
												+ "\nvoc� de forma abrupta!");
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
									System.out.println("\n- Muito bem, voc� pode passar..."
											+ "O livro apenas se fecha, abrindo passagem para voc�, que ao seguir pelo teatro"
											+ "\nse depara com uma grande porta dourada."
											+ "\nDestemido, voc� abre a porta em um unico movimento!"
											+ "\nUma poderosa luz e anjos cantando o recebe!"
											+ "\nVoc� adentra uma grande sala dourada, brilhante e vazia..."
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
									System.out.println("\nFinalmente voc� conseguiu!!! Conquistou a espada lendaria!!!"
											+ "\nA Diamound Dust � sua! Mas lembre-se..."
											+ "\n'Com grandes poderes, vem grandes responsabilidades!'"
											+ "\nPortanto, seu dever agora � usar da espada para proteger o mundo"
											+ "\nda Fam�lia 36!"
											+ "\nBoa sorte "+nome+" sua verdadeira batalha come�a agora!"
											+ "\nAo retirar a espada, uma grande luz negra cobre a sala por completo junto de um grande estrondo..."
											+ "\nOlhos vermelhos s�o vistos na escurid�o, voc� sentia, ali estava ele, Malevolus, o Spring!");
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
									System.out.println("\n- Vejo que chegou bem longe jovem, por�m, tudo termina aqui...");
									System.out.println("\nA voz de Malevolus era amea�adora, Coberto por seu manto, o mesmo"
											+ "\nse prepara para desferir um golpe com sua magia mais poderosa, CRUD."
											+ "\nO que voc� far�?"
											+ "\n1 - Desviar para a esquerda."
											+ "\n2 - Desviar para a diretia.");
									opgame5 = leia.nextInt();
									while(opgame5<=0 || opgame5>2) {
										System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
										opgame5 = leia.nextInt();
									}
									if(opgame5==1) {
										System.out.println("\n Escolhendo a dire��o errada, voc� � pego pela avalanche de classes, o poder da magia CRUD � grande...");
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
										System.out.println("\n Voc� escolheu a dire��o certa, pulando para a direita e desviando facilmente!"
												+ "\nEntretanto, Malevolus n�o para seus ataques, dessa vez, utilizando da magia TRAVAMENTO DE PC AO ABRIR POSTMAN E SPRING AO MESMO TEMPO"
												+ "\nE agora jovem her�i, como ir� escapar dessa?"
												+ "\n1 - Desviar para a esquerda."
												+ "\n2 - Desviar para a diretia.");
										opgame6 = leia.nextInt();
										while(opgame6<=0 || opgame6>2) {
											System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
											opgame6 = leia.nextInt();
										}
										if(opgame6==2) {
											System.out.println("\n Escolhendo a direita errada, voc� � pego pelo travamento infinito e fica para sempre congelado...");
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
											System.out.println("\nVoc� consegue desviar mais uma vez, a furia de Malevolus o leva a usar sua magia mais cruel, a Desesperan�a..."
													+ "\n� agora, essa � sua ultima chance de derrotar o poderoso Spring, o que far�?"
													+ "\n1 - Usar a espada!"
													+ "\n2 - Desviar para a esquerda!");
										}
										opgame7 = leia.nextInt();
										while(opgame7<=0 || opgame7>2) {
											System.out.println("\nAten��o, op��o invalida, por gentileza, digite novamente: ");
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
											System.out.println("\nCom um movimento forte, voc� rebate a magia do poderoso Spring o atingindo!"
													+ "\n- Como? Como isso � poss�vel?"
													+ "\nCom um sorriso no rosto, voc� assiste ao desaparecimento de Malevolus para sempre..."
													+ "\nCom seu dever cumprido, voc� se retira da caverna sorrindo, olhando o belo por do Sol..."
													+ "\nA cada passo as palavras de seu mestre ecoavam por sua mente..."
													+ "\n'Confie no processo...'"
													+ "\nParab�ns "+nome+" voc� salvou o mundo do desespero e desesperan�a, todos os habitantes sempre"
													+ "\nir�o lembrar do grande her�i que um dia os salvou!"
													+ "\nO mundo da Fam�lia 36 descansa em uma era de paz mais uma vez!!!");
											System.out.println(" _______  __  .___  ___. \r\n"
													+ "|   ____||  | |   \\/   | \r\n"
													+ "|  |__   |  | |  \\  /  | \r\n"
													+ "|   __|  |  | |  |\\/|  | \r\n"
													+ "|  |     |  | |  |  |  | \r\n"
													+ "|__|     |__| |__|  |__| \r\n"
													+ "                         ");
										}
											
								if(opgame3==2) {
									System.out.println("\n- Criatura insolente!! Sua falta de cren�a me assusta..."
											+ "\nEm um unico movimento com os cajados, os s�bios abrem um buraco negro abaixo de voc�...");
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




