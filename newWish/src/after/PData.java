package after;

public class PData {
	private String name;
    private int id;
     
    void set(int id_temp, String t_name)
    {
        this.id = id_temp;
        this.name = t_name;
    }
     
    void show()
    {
        System.out.println("ID NO = " + id);
        System.out.println("Name = " + name);
    }
}
