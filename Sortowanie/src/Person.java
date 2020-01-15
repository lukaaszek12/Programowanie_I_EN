public class Person implements Comparable<Person> {
    int age;
    String name;
    String surname;

    public Person(String n, String s, int a){
        this.name=n;
        surname=s;
        age=a;
    }

//    @Override
//    public int compareTo(Osoba p){
//        return this.wiek-p.wiek;
//    }

//    @Override
//    public int compareTo(Osoba p){
//        return this.nazwisko.compareTo(p.nazwisko);
//    }

//    @Override
//    public int compareTo(Osoba p){
//        if(this.nazwisko.compareTo(p.nazwisko)==0){
//            return this.imie.compareTo(p.imie);
//        }
//        else{
//            return this.nazwisko.compareTo(p.nazwisko);
//        }
//    }

    @Override
    public int compareTo(Person p){
        if(this.surname.compareTo(p.surname)==0){
            if(this.name.compareTo(p.name)==0){
                return this.age-p.age;
            }
            else {
                return this.name.compareTo(p.name);
            }
        }
        else{
            return this.surname.compareTo(p.surname);
        }
    }
}
