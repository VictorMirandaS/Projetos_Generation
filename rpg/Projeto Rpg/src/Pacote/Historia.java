package Pacote;

import java.util.concurrent.TimeUnit;
import java.util.*;

public class Historia {
     Personagens principal = new Heroi();
     
     public Historia(Personagens heroi) {
    	 principal = heroi;
    	 
     }
 Scanner ler = new Scanner(System.in);	
     
     
     
     public int pular() {
    	 int opc;
    	 System.out.println("Deseja pular hist�ria?\n1 para sim\n2 para n�o");
    	 opc = ler.nextInt();
    	 return opc;	 
     }
     
     
     public void introHistoria() throws InterruptedException {
		System.out.println(principal.getNome()+" Voc� precisa me ajudar, a muito tempo atr�s antes mesmo do tempo sequer existir nosso destino ja havia sido tra�ado");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Nosso mundo esta preso em um loop infinito, por incont�veis eras a humanidade repete o ciclo de se auto degradar e destruir");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("No in�cio vivemos pacificamente com os elementos e a natureza, por�m a ganancia da humanidade nos leva a um caminho destrutivo");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("Algumas pessoas acreditam que esse � o melhor  caminho que o mundo pode seguir e que � a natureza dele repetir esse loop infinitamente. \n"+principal.getNome()
		+" ,somente nos dois podemos quebrar esse ciclo e salvar a humanidade");
		TimeUnit.SECONDS.sleep(4);
		System.out.println("A prop�sito meu nome � �cari, e eu consigo viajar pelo tempo, de algum modo eu sei que n�s podemos encontrar respostas no passado, VAMOS");
		TimeUnit.SECONDS.sleep(4);
		System.out.println();
		System.out.println("Chegamos, estamos em algum lugar do tempo quando o mundo ainda era jovem, ali, naquela floresta tem algo que pode nos ajudar");
		System.out.println();
	}
     public void usinaHistoria() throws InterruptedException {
         System.out.println("�cari: Agora temos que ir para o futuro, instantes antes do fim, onde eu serei for�ada a reviver o sofrimento de um amigo.");
         TimeUnit.SECONDS.sleep(4);
         System.out.println("\n*Salto no tempo - Ano: 2570 D.A.\n");
         TimeUnit.SECONDS.sleep(4);
         System.out.println("�cari: Essa � a Usina de Genm�polis, o �nico local capaz de comportar o �ltimo cristal el�trico, precisamos chegar no n�cleo para\nimpedir uma cat�strofe.");
      }
     public void fimHistoria() throws InterruptedException {
    	 System.out.println("Icari: Eu sei quem esta com o ultimo cristal, ele � meu amigo, o nome dele � Florin.");
    	 TimeUnit.SECONDS.sleep(4);
         System.out.println(principal.getNome() + " e �cari v�o em dire��o a casa de Florin, real dono da pedra, chegando l� encontram Cintinara com uma faca\napontada para a garganta dele:");
         TimeUnit.SECONDS.sleep(4);
         System.out.println("Cintinara: Bem que Dr. Stein estava certo sobre suas suspeitas, eu estou aqui para recuperar o que � de fato NOSSO� O mundo s� estar�\nseguro se seguirmos o que o Dr. estava planejando, n�o teremos chances! Me deem o cristal ou eu corto a garganta desse homem!!");
         TimeUnit.SECONDS.sleep(4);
         System.out.println("Rapidamente " + principal.getNome() + " retira a espada da bainha e avan�a para cima de Cintinara");
     }
     
     
}
