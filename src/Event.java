import java.time.LocalDate;
import java.util.*;
public class Event {
     int event_id;
     String event_name;
     String event_date;
     String category;
    LocalDate created_date = LocalDate.now(); 

Event(int eid,String ename,String edate,String catg){
    this.event_id = eid;
    this.event_name = ename;
    this.event_date = edate;
    this.category = catg; 
}

public void Eventdetails() {
  
    System.out.println("Event id : " + event_id);
    System.out.println("Event name : " + event_name);
    System.out.println("Event category : " + category);
    System.out.println("event_date : " + event_date);
    System.out.println("Event created on : " + created_date);
}
public static void main(String[] args) {
    int n;
    Event event1 = new Event(01,"Smart India hackathon","25-Dec-2020","coding contest");
    Event event2 = new Event(02, "Competitive Programming Webinar", "26-Dec-2020", "Webinar");
    Event event3 = new Event(03, "TED Talks Ft.Sandeep Maheshwari", "27-Dec-2020", "Talk show");
    System.out.println(" -----Event List-----");
    System.out.println(" 1. "+ event1.event_name);
    System.out.println(" 2. "+ event2.event_name);
    System.out.println(" 3. "+ event3.event_name);
    System.out.println(" ---------------------");
    Scanner sc =new Scanner(System.in);
    System.out.println(" Enter The Numbers Pointing the event to get the Event details");
    n = sc.nextInt();
    
    //used switch case to display events
    switch(n){
        case 1:
        event1.Eventdetails();
        break;
        case 2:
        event2.Eventdetails();
        break;
        case 3:
        event3.Eventdetails();
        break;
        default:
        System.out.println(" Enter the correct number");
    }
    sc.close();
  }
}
