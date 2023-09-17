# 5º Exercício de Threads
Exibe o tempo de resposta e média final do comando ping de 3 servidores

## Descrição do exercício
No Sistema Operacional Linux, o comando para realizar uma operação de ping com 10 iterações é ping -4 -c 10 <servidor>. <br>
Fazer uma aplicação Java que rode 3 Thread em S.O. Linux fazendo operação de ping para os servidores UOL (www.uol.com.br), Terra (www.terra.com.br) e Google (www.google.com.br). <br>
Cada thread deve ler a saída do ping imprimindo, a cada iteração, o nome do servidor (usar fixo: UOL, Terra ou Google) e o tempo daquela iteração. <br>
Ao final, deve-se exibir o nome do servidor (usar fixo: UOL, Terra ou Google) e o tempo médio obtido pela operação. Outros Sistemas Operacionais devem ser descartados. <br>

<br>**OBS:** fiz em Windows primeiro, depois passei para Linux. Caso queira ver o do Windows, basta olhar o primeiro commit.
