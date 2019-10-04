/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetimeperformance;
import java.sql.Timestamp;    
import java.util.Date;
import java.util.List;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.text.DecimalFormat; 
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import TesteGrafico.Grafico;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 *
 * @author SempreIT
 */
public class RelatorioITI {



private static String id_pedido_cliente_barra_progresso="";
private static int totallinhas=0;
private static int numero_pedido=0;
private static String str;
private static String[] virgula;
private static int contaencontrados=0;
public static int teste;
public static int pedido_encontrado=0;
public static int pedido_c_encontrado=0;



public static int prosseguir_inclusao_item=0;


/**
 * @param args
 * @throws IOException
 * @throws InterruptedException
 * @throws NullPointerException
 * @throws ParseException
 * @throws ArrayIndexOutOfBoundsException
 */
/**
 * @param args
 * @throws IOException
 * @throws InterruptedException
 * @throws NullPointerException
 * @throws ParseException
 * @throws ArrayIndexOutOfBoundsException
 */
/**
 * @param args
 * @throws IOException
 * @throws InterruptedException
 * @throws NullPointerException
 * @throws ParseException
 * @throws ArrayIndexOutOfBoundsException
 */
/**
 * @param args
 * @throws IOException
 * @throws InterruptedException
 * @throws NullPointerException
 * @throws ParseException
 * @throws ArrayIndexOutOfBoundsException
 */
public static void main(String[] args) throws IOException, InterruptedException, NullPointerException, ParseException,ArrayIndexOutOfBoundsException {

	List<String> dados =new ArrayList<String>();
	
	String caminho_arquivo="C:\\TESTE\\TESTE.log";

	//JOptionPane.showMessageDialog(null, caminho_arquivo);
	
 System.out.println("ABRINDO CAMINHO DO ARQUIVO...");
    
    
  /*
  	
  
    JFileChooser abrindoArquivo = new JFileChooser();  
    int resultado = abrindoArquivo.showOpenDialog(null);  
    if (resultado != JFileChooser.APPROVE_OPTION){
       
         
        return;  
    }  
    

  File abreArquivoEscolhido = abrindoArquivo.getSelectedFile();  
  
int arquivo_valido=0;
  
  if(abreArquivoEscolhido.getName().contains(".csv")||abreArquivoEscolhido.getName().contains(".CSV")||abreArquivoEscolhido.getName().contains(".Csv")||abreArquivoEscolhido.getName().contains(".CsV")||abreArquivoEscolhido.getName().contains(".cSV")||abreArquivoEscolhido.getName().contains(".CSv")||abreArquivoEscolhido.getName().contains(".csV")){
      
      System.out.println("OK ARQUIVO VALIDO!");
   arquivo_valido=1;
  }
  
  if(arquivo_valido==0){
      
   JOptionPane.showMessageDialog(null,"FORMATO DO ARQUIVO INVALIDO!\nFAVOR SELECIONAR UM ARQUIVO .CSV ...");
    
    System.exit(0);
    
  }
  
 
  
  
  
  
      

System.out.println("ABRINDO NA PASTA..." + abreArquivoEscolhido);


//String Caminho= "/home/fernando-rnl/NetBeansProjects/RNL/src/ATUALIZA_STATUS_PEDIDO_PANILHA/25-09-2017_ANTES_ALTERAR_EXPEDIDO.csv";
    
    
    
    FileReader arquivo=new FileReader(abreArquivoEscolhido);
    
    */
// BufferedReader in=new BufferedReader(arquivo);

 //abreArquivoEscolhido=caminho_arquivo;

//System.out.println( "VERIFICANDO ARQUIVO : " + abreArquivoEscolhido + " ...");

 
        FileReader file =new FileReader(caminho_arquivo);

        BufferedReader in=new BufferedReader(file);
        
   /*SALVAR RESULTADO EM ARQUIVO  
                      
     JOptionPane.showMessageDialog(null, "FAVOR SELECIONAR O LOCAL PARA SALVAR OS ARQUIVOS CONVERTIDOS...");
           JFileChooser salvandoArquivo = new JFileChooser();  
    int resultado2 = salvandoArquivo.showSaveDialog(null);  
    if (resultado2 != JFileChooser.APPROVE_OPTION) {
       
         
        return;  
    }  
     
     
  File salvarArquivoEscolhido = salvandoArquivo.getSelectedFile();  

    
        if(salvandoArquivo==null){
        
        JOptionPane.showMessageDialog(null,"FECHANDO...");
        System.exit(0);
        
    }
        
            
    if(salvandoArquivo.equals("")){
        
        JOptionPane.showMessageDialog(null,"CAMINHO DIGITADO INCORRETO! FECHANDO PROGRAMA...");
        System.exit(0);
        
    }
    
    
    String nome=salvarArquivoEscolhido.toString();
    String nome_arquivo=nome.replace(".csv", "_");

           FileOutputStream out =new FileOutputStream(nome_arquivo+"SAIDA_ARQUIVO.csv",true);

         OutputStreamWriter objOut=new OutputStreamWriter(out);
        
    SALVAR RESULTADO EM ARQUIVO      */
        
 
 while(in.ready()){
 
    

		
     for (int i = 0; i <= totallinhas; i++) {
    	   totallinhas++;//CONTA TOTAL DE LINHAS
    

     str=in.readLine();
    // str.toString()
     		//dados.add(str);
     
//JOptionPane.showMessageDialog(null, dados.get(i).charAt(0));
     		try {	
//JOptionPane.showMessageDialog(null, dados.get(i).toString().charAt(83)+""+dados.get(i).toString().charAt(84));
     			if(totallinhas==1) {
     				
     				String nome_linha=str.toString().charAt(94)+""+str.toString().charAt(95)+""+str.toString().charAt(96)+""+str.toString().charAt(97)+""+str.toString().charAt(98)+""+str.toString().charAt(99);
     				
     				JOptionPane.showMessageDialog(null, "linha :"+totallinhas);
     				JOptionPane.showMessageDialog(null, nome_linha);

     			}
     			
     			
     			if(totallinhas==2) {
     				
     				String nome_linha2=str.toString().charAt(94)+""+str.toString().charAt(95)+""+str.toString().charAt(96)+""+str.toString().charAt(97)+""+str.toString().charAt(98)+""+str.toString().charAt(99);
     				
     				JOptionPane.showMessageDialog(null, "linha :"+totallinhas);
     				JOptionPane.showMessageDialog(null, nome_linha2);

     			}
     			
     			
     }catch(IndexOutOfBoundsException e){
    	  System.out.println("Coluna não encontrada...");
      }
                                                }
     
   
 

     
                    }


                                                                                }
}




