/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ntborges
 */
public class GeraArquivoLog {
 public void Log() throws IOException {
        
        // Adicionar diretório 
        File file = new File("C:\\LogsUsoLeitura"); 
        
        
        // Criar diretório 
        file.mkdir();
        
        // Deletar diretório 
        file.delete(); 
        
        // Caminho para o arquivo 
        File arquivo = new File ("C:\\LogsUsoLeitura\\Arquivo.txt");
        
        try {
        
        // Criar arquivo em branco 
        FileWriter filewriter = new FileWriter(arquivo); 
        
        // Objeto para abrir o arquivo em branco 
        BufferedWriter escrever = new BufferedWriter (filewriter); 
        
        Date dataHoraAtual = new Date(); 
        
        String data = new SimpleDateFormat ("dd/MM/yyyy").format(dataHoraAtual); 
        String hora = new SimpleDateFormat ("HH:mm:ss").format(dataHoraAtual); 
        
        
        // Escrever no arquivo em branco 
        escrever.write("Leitura - Relatório de uso" + data + " " + hora);
        
        // Ler conteudo do arquivo (Criação de objeto) 
        FileReader ler = new FileReader (arquivo) ; 
        
        // Criar outro objeto (leitura de linhas) 
        BufferedReader lerB = new BufferedReader (ler); 
        String linha = lerB.readLine(); 
        
        
        while (linha != null) {
            
            // escrever na linha
            System.out.println(linha); 
            
            // passar para o prÃ³xima linha 
            linha = lerB.readLine(); 
        
        }
        
        // Comando para escrever na outra linha 
        File fil = new File ("/"); 
        
        // Terminou de escrever, escrever novamente (repetir o ciclo) 
        File fi [] = fil.listFiles(); 
        
        // Alimentar as linhas
        for (File fi1 : fi) {
            System.out.println(fi1);
        }
        
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(ArquivosJava.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
           // Logger.getLogger(ArquivosJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Try catch parar criaÃ§Ã£o e exclusÃ£o de arquivo       
        try {
            //criar arquivo
            arquivo.createNewFile();
            //deletar arquivo
            arquivo.delete();

        } catch (IOException ex) {

            // Logger.getLogger(ArquivosJava.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
