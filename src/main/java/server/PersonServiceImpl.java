package  server;
import org.apache.thrift.TException;
import thrift.generated.DataException;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class PersonServiceImpl implements PersonService.Iface{


    public Person getPersonByUsername(String username) throws DataException, TException {
        System.out.println("Got client Param:" + username);

        Person person = new Person();
        person.setUsername(username);
        person.setAge(32);
        person.setMarried(true);

        return person;
    }


    public void savePerson(Person person) throws DataException, TException {
        System.out.println("Got Client Param: ");

        System.out.println(person.getUsername());
        System.out.println(person.getAge());
        System.out.println(person.isMarried());
    }
}