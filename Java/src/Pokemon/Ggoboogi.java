package Pokemon;

public class Ggoboogi extends Pokemon{
    private String name;

    public Ggoboogi(){
        super();
    }

    public Ggoboogi(String owner, String skill_list){
        super(owner, skill_list);
        this.name = "Ggoboogi";
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack(int idx) {
        System.out.println("[Ggoboog!]"+ getOwner()+"'s Pokemon "+getName() + "excutes (water)" + getSkills()[idx - 1]);
    }

    public void swim(){
        System.out.println(getName()+"가 수영을 합니다.");
    }
}
