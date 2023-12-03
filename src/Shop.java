import java.util.ArrayList;

public class Shop {
    ArrayList<Computer> list=new ArrayList<>();
    public String getNameInShop(int number){
        Computer a=this.list.get(number);
        return a.getName();
    }
    public void getAll(){
        for(int i=0;i<this.list.size();i++){
            int h=i+1;
            System.out.println(h+") "+this.list.get(i));
        }
    }
    public void addComputer(String n1,String p1,String v1,int y1){
        Computer a = new Computer();
        a.setAll(n1,p1,v1,y1);
        list.add(a);
    }
    public void deleteComputer(int number){
        list.remove(number-1);
    }
    public void search(String name){
        boolean a = false;
        for(int i=0;i< list.size();i++){
            if(getNameInShop(i) == name){
                System.out.println(list.get(i));
            }else{System.out.println("Такого компьютера нет в магазине");}
        }
    }
    public void interfaceInShop(){
        System.out.println("1)Добавить компьютер в магазин"+"\n2)Удалить компьютер из магазина"+"\n3)Вывести все компьютеры в магазине"+"\n4)Найти компьютер в магазине(по названию)"+"\n5)Выход");
    }
}
