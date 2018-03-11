import java.io.*;
import java.sql.Timestamp;
public class nbldb{
  private String MD = "##", TSC = "TIME_CREATED", TSM = "TIME_MODIFIED" , NL = "\n" , SP = " ";
  public static void main(String args[])throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Database name");
    String db_name = reader.readLine();
    File file = new File(db_name + ".txt");
    FileWriter writer = new FileWriter();
    if(!file.exists()){
    file.createNewFile();
    createMetaData(db_name);
  }
  }
  void createMetaData(String db_name){
     Timestamp timestamp = new Timestamp(System.currentTimeMillis());
     writer.write(MD+SP+TSC+timestamp);
  }
}
