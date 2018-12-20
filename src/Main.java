import by.gsu.lab.beans.Indication;
import by.gsu.lab.beans.dao.DBIndicationDAO;
import by.gsu.lab.beans.dao.DBIndicationDAOImplementation;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
            showMenu();
            while (userInput.hasNext()){
                userChoice(userInput.nextInt());
            }
    }

    private  static void  showMenu()throws java.io.IOException {
        System.out.println("1. Показать записи");
        System.out.println("2. Добавить запись");
        System.out.println("3. Удалить запись");
    }

    private static void userChoice(int numMenu) throws IOException {
                switch (numMenu){
            case 1:
                showIndications();
                break;
            case  2:
                System.out.println("Добавить");
                createIndication();
                break;
            case 3:
                System.out.println("Удалить");
                deleteIndication();
                break;
        }
    }
    private static void showIndications() throws IOException {
        DBIndicationDAOImplementation dao = new DBIndicationDAOImplementation();
        List<Indication> indications = dao.getIndications();
        for (int index = 0; index < indications.size(); index++){
            System.out.println(indications.get(index));
        }
        showMenu();
    }

    private static  void createIndication() throws IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите новые данные показателя (название,значение,дата)");
        String newData = userInput.nextLine();
        String[] dataArray = newData.split(",");
        DBIndicationDAOImplementation dao = new DBIndicationDAOImplementation();
        dao.createIndication(new Indication(1, dataArray[0],Integer.parseInt(dataArray[1]),dataArray[2]));
        showMenu();
    }

    private static  void deleteIndication() throws IOException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите номер показателя");
        DBIndicationDAOImplementation dao = new DBIndicationDAOImplementation();
        dao.deleteIndication(userInput.nextInt());
        showMenu();
    }
}
