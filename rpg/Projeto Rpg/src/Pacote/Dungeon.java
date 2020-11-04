package Pacote;

import java.util.concurrent.TimeUnit;

public class Dungeon{
	Personagens inimigoD1 []= new MonstrosDg1[2];
	Personagens inimigoD2[]= new MonstrosDg2[2];
	Boss boss1 = new Boss("Florestoso");
	Boss boss2 = new Boss("Dr Stein");
	Boss boss3 = new Boss("Cintinara");
	Personagens principal;
	
	
	public Dungeon(Personagens heroi) {
		principal = heroi;
		
	}
	
	public void sorteiaBatalhaDg1() throws InterruptedException {
		for(int i=0; i<2;i++) {
			inimigoD1[i] = new MonstrosDg1();
			Batalha batlle= new Batalha(principal,inimigoD1[i]);
			batlle.iniciarBatalha();
			if(i==0) {
				System.out.println("***************************************************************************************************");
				System.out.println();
				System.out.println("Uau, isso foi dificil, mas agora estamos um passo mais perto, eu posso sentir....");
			    System.out.println();
			    System.out.println("***************************************************************************************************");
			}
			if(i==1) {
				System.out.println("***************************************************************************************************");
				System.out.println();
				System.out.println("EI, O QUE � AQUILO, CUIDADO, PARECE SER MAIS PERIGOSO DO QUE TUDO QUE ENFRENTAMOS AT� AGORA!!!!");
		        System.out.println();
		        System.out.println("***************************************************************************************************");
			}
			TimeUnit.SECONDS.sleep(3);	
		}
	}
		
		public void sorteiaBatalhaDg2() throws InterruptedException {
			for(int i=0; i<2;i++) {
				inimigoD2[i] = new MonstrosDg2();
				Batalha batlle= new Batalha(principal,inimigoD2[i]);
				batlle.iniciarBatalha();
				if(i==0) {
					System.out.println("***************************************************************************************************");
					System.out.println();
					System.out.println("Uau, isso foi dificil, mas agora estamos um passo mais perto, eu posso sentir....");
				    System.out.println();
				    System.out.println("***************************************************************************************************");
				}
				if(i==1) {
					System.out.println("***************************************************************************************************");
					System.out.println();
					System.out.println("EI, O QUE � AQUILO, CUIDADO, PARECE SER MAIS PERIGOSO DO QUE TUDO QUE ENFRENTAMOS AT� AGORA!!!!");
			        System.out.println();
			        System.out.println("***************************************************************************************************");
				}
				TimeUnit.SECONDS.sleep(3);	
			}	
	}
	
	  public void curaPrincipal() {
		  System.out.println("\n VIDA RESTAURADA!!!!!");
		  principal.setVida(200);
	  }

      public void chamaBoss1() throws InterruptedException {
    	  boss1.constroiBoss1();
    	  System.out.println();
    	  System.out.println("�cari: Apesar de nossas boas inten��es, essas criaturas n�o nos compreendem,precisamos dessa for�a emprestada\nestamos quase chegando no guardi�o do cristal, Florestoso.");
    	  TimeUnit.SECONDS.sleep(4);
    	  System.out.println(principal.getNome()+": Ele nos percebeu");
    	  TimeUnit.SECONDS.sleep(4);
    	  System.out.println("Arvoroso: Voc� veio at� aqui para roubar isso? Um artefato sagrado?! SEUS MALDITOS!!!");
    	  System.out.println();
    	  TimeUnit.SECONDS.sleep(3);
    	  Batalha batlle= new Batalha(principal,boss1);
    	  batlle.iniciarBatalha();
    	  TimeUnit.SECONDS.sleep(3);
    	  System.out.println();
    	  System.out.println("Voc� esta cometendo um erro....");
    	  System.out.println("VOC� OBTEVE O CRISTAL SAGRADO DA VIDA");
      }
      public void chamaBoss2() throws InterruptedException {
          boss2.constroiBoss2();
          System.out.println();
          System.out.println("Dr.Stein: Voc�! Voc� nos abandonou, o que veio fazer aqui?\n");
          TimeUnit.SECONDS.sleep(4);
          System.out.println();
          System.out.println("�cari: Stein, n�s precisamos do cristal, se voc� ligar essa m�quina ser� o fim de tudo!\n");
          TimeUnit.SECONDS.sleep(4);
          System.out.println();
          System.out.println("Dr.Stein: � MENTIRA! TUDO O QUE VOC� DIZ � MENTIRA, EU VOU FAZER TUDO VOLTAR AO QUE ERA E VOC�S N�O PODEM ME IMPEDIR!");
          TimeUnit.SECONDS.sleep(4);
          System.out.println();
          Batalha batlle= new Batalha(principal,boss2);
          batlle.iniciarBatalha();
          System.out.println();
          System.out.println("Dr.Stein: N�o! N�o levem! � minha �ltima esperan�a�\n");
          TimeUnit.SECONDS.sleep(4);
          System.out.println();
          System.out.println("�cari: Me desculpe amigo, assim que tudo acabar, voc� nunca mais vai precisar sofrer assim.\n");
          TimeUnit.SECONDS.sleep(4);
          System.out.println("Vamos "+principal.getNome()+", temos que dar um fim nisso.");
          TimeUnit.SECONDS.sleep(4);
          System.out.println("VOC� OBTEVE O CRISTAL SAGRADO DO PODER");
      }
      
      public void chamaBoss3() throws InterruptedException {
    	  boss3.constroiBoss3();
    	  System.out.println();
    	  System.out.println("Cintinara: Vamos resolver isso de uma vez por todas.");
    	  System.out.println();
    	  TimeUnit.SECONDS.sleep(3);	
    	  Batalha batlle= new Batalha(principal,boss3);
    	  batlle.iniciarBatalha();
    	  TimeUnit.SECONDS.sleep(3);
    	  System.out.println();
    	  if(batlle.isVitoria()==true)
    	  {
    		  System.out.println("Cintinara: Traidores� Espero que queimem nas profundezas do inferno!!");
    		  TimeUnit.SECONDS.sleep(3);
              System.out.println("Os her�is resgatam Florin e entregam o ultimo cristal para ele. retirando o mundo do loop infinito");
              TimeUnit.SECONDS.sleep(3);
              System.out.println("�cari: Finalmente o loop foi desfeito e a ordem do mundo e dos elementos voltou a sua forma original�");
              TimeUnit.SECONDS.sleep(3);
              System.out.println(principal.getNome() + ": e o que aconteceu com o Dr. Stein? H� outros al�m dele com a mesma ideologia?");
              TimeUnit.SECONDS.sleep(3);
              System.out.println("�cari: Infelizmente, ele teve que sofrer as consequ�ncias das suas pr�prias escolhas� e caso haja outros seguidores, precisaremos derrota-los antes\nde causarem o caos de novo, mas por enquanto� n�o devemos nos preocupar, vamos comemorar a vit�ria de hoje.");
              TimeUnit.SECONDS.sleep(3);
              System.out.println("CABOU");
    	  }
    	  else {
    		  System.out.println("Com os her�is derrotados, Cintinara retorna ao futuro e salva Stein antes que os her�is o impe�am");
    		  TimeUnit.SECONDS.sleep(3);
    		  System.out.println("Com os critais em m�os, Dr. Stein tenta quebrar o loop e o resultado � catastr�fico retornando a humanidade ao inicio dos tempos\nperpetuando o loop");
    		  TimeUnit.SECONDS.sleep(3);
    		  System.out.println("Enquanto voc� n�o deter o Stein o loop continuar�.");
    		  TimeUnit.SECONDS.sleep(3);
    		  System.out.println("O mundo foi resetado......de novo");
    		  
    	  }
    	  
      }








}
