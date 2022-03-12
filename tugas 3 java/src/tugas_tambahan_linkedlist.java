import java.util.LinkedList;

public class tugas_tambahan_linkedlist {
    public static void main(String[] args) {

        //Soal 1 
        //Buatlah sebuah LinkedList yang mana pada LinkedList tersebut dapat menambah data berupa No_Bp, 
        //Nama_Mahasiswa, Alamat.

        //create title of task
        System.out.println("\n");
        System.out.println("\t\t\t..................TUGAS 3 TAMBAHAN SDA [LINKED LIST]..................");
        System.out.println("\t\t\t----------------------------------------------------------------------");
        System.out.println("\n");

        //create linked list with BP Number, Name, and Address as the element using add() operation
        LinkedList <String> name = new LinkedList<String>();
        LinkedList <String> bpnumber = new LinkedList<String>();
        LinkedList <String> address = new LinkedList<String>();

        bpnumber.addFirst("2111523021");
        name.addFirst("Hasya Zikra Alfrena");
        address.addFirst("Padang");

        bpnumber.add("1911521989");
        name.add("Taylor Swift");
        address.add("Nashville");

        bpnumber.add("2011523021");
        name.addLast("Conan Gray");
        address.add("Los Angeles");

        bpnumber.add(3,"1911513014");
        name.add(3,"Patrick");
        address.add(3,"Medan");

        System.out.println("using add() operation ");
        System.out.println("\tbpnumber added  : " + bpnumber);
        System.out.println("\tstudent names   : " + name);
        System.out.println("\tstudent address : " + address);
        System.out.println("\n");

        //Soal 2
        //Kemudian Tambahkan beberapa fungsi/operasi pada LinkedList yang anda ketahui
             
        // using isEmpty() operation
        System.out.println("using isEmpty() operation");
        System.out.println("\tIs bpnumber linkedlist empty? " + bpnumber.isEmpty());
        System.out.println("\tIs name linkedlist empty?     " + name.isEmpty());
        System.out.println("\tIs address linkedlist empty?  " + address.isEmpty());
        System.out.println("\n");

        // using size() operation
        System.out.println("using size() operation");
        System.out.println("\tWhat's the size of bpnumber linkedlist? " + bpnumber.size());
        System.out.println("\tWhat's the size of name linkedlist?     " + name.size());
        System.out.println("\tWhat's the size of addressr linkedlist? " + address.size());
        System.out.println("\n");

        // using get() operation
        System.out.println("using get() operation");
        System.out.println("\tWhat's inside the 0th index of bpnumber linkedlist ? " + bpnumber.get(0));
        System.out.println("\tWhat's inside the 1st index of name linkedlist ?     " + name.get(1));
        System.out.println("\tWhat's inside the 2nd index of address linkedlist ?  " + address.get(2));
        System.out.println("\n");

        // using indexOf() operation
        System.out.println("using indexOf() operation");
        System.out.println("\tWhat's the index of '1911513014' in bpnumber linkedlist? " + bpnumber.indexOf("1911513014"));
        System.out.println("\tWhat's the index of 'Conan Gray' in name linkedlist?     " + name.indexOf("Conan Gray"));
        System.out.println("\tWhat's the index of 'Nashville' in address linkedlist?   " + address.indexOf("Nashville")); 
        System.out.println("\n");
             
        // using remove() operation
        System.out.println("using remove() operation");
        System.out.println("\tlet's remove the 0th (first) index of bpnumber linkedlist ");
        bpnumber.removeFirst();
        System.out.println("\tthe bpnumber linkedlist elements now      : " + bpnumber);
        System.out.println("\tand the bpnumber linked list size will be : " + bpnumber.size());
        System.out.println(" ");

        System.out.println("\tlet's remove the 2nd index of name linked list ");
        name.remove(2);
        System.out.println("\tthe name linkedlist elements now      : " + name);
        System.out.println("\tand the name linked list size will be : " + name.size());
        System.out.println(" ");

        System.out.println("\tlet's remove the 3rd (Last) index of address linked list ");
        address.removeLast();
        System.out.println("\tthe address linkedlist elements now      : " + address);
        System.out.println("\tand the address linked list size will be : " + address.size());
        System.out.println(" ");

        // using set() operation
        System.out.println("using set() operation");
        bpnumber.set(1,"2111525252");
        name.set(2,"Adit");
        address.set(0,"New York");

        System.out.println("\tbpnumber linkedlist after set operation : " + bpnumber);
        System.out.println("\tname linkedlist after set operation     : " + name);
        System.out.println("\taddress linkedlist after set operation  : " + address);
        System.out.println("\n");

        // using pop() operation
        System.out.println("using pop() operation");
        bpnumber.pop();
        name.pop();
        address.pop();
        System.out.println("\tbpnumber linkedlist after pop operation : " + bpnumber);
        System.out.println("\tname linkedlist after pop operation     : " + name);
        System.out.println("\taddress linkedlist after pop operation  : " + address);
        System.out.println("\n");

        // using push() operation
        System.out.println("using push() operation");
        bpnumber.push("1234567899");
        name.push("Hazi Alena");
        name.push("Adelle");
        address.push("London");
        System.out.println("\tbpnumber linkedlist after push operation : " + bpnumber);
        System.out.println("\tname linkedlist after push operation     : " + name);
        System.out.println("\taddress linkedlist after push operation  : " + address);
        System.out.println("\n");

        // using poll() operation
        System.out.println("using poll() operation");
        bpnumber.pollFirst();
        name.poll();
        address.pollLast();
        System.out.println("\tbpnumber linkedlist after poll() operation    : " + bpnumber);
        System.out.println("\tname linkedlist after pollFirst() operation   : " + name);
        System.out.println("\taddress linkedlist after pollLast() operation : " + address);

        //add closing statement
        System.out.println("\n");
        System.out.println("\t\t\t.............................THE END..................................");
        System.out.println("\t\t\t----------------------------THANK YOU---------------------------------");
        System.out.println("\n");
    }
}
