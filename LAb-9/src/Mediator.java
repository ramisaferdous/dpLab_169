
import java.util.*;
import java.util.Hashtable;



public class Mediator  implements IWidget{
    CurrentWaqt currentWaqt;
    CurrentTime currentTime;
    WaqtTimeTable waqtTimeTable;
    PrayerTimeTable prayerTimeTable;
    NextPrayer nextPrayer;
    Location location;
    Timezone timezone;
    PrayertimeSettings prayertimeSettings;

    public Mediator(){
        currentWaqt= new CurrentWaqt(this);
        currentTime= new CurrentTime(this);
        waqtTimeTable= new WaqtTimeTable(this);
        prayerTimeTable= new PrayerTimeTable(this);
        nextPrayer= new NextPrayer(this);
        location= new Location(this);
        timezone= new Timezone(this);
        prayertimeSettings= new PrayertimeSettings(this);
    }

    Hashtable<IWidget, List<IWidget>> dependency= new Hashtable<>();

    void Register(){
        List<IWidget>currentwaqtlist=new ArrayList<>();
        currentwaqtlist.add(currentTime);
        currentwaqtlist.add(waqtTimeTable);

        List<IWidget>nextprayerlist=new ArrayList<>();
        nextprayerlist.add(currentTime);
        nextprayerlist.add(prayerTimeTable);

        List<IWidget>locationlist=new ArrayList<>();
        locationlist.add(waqtTimeTable);

        List<IWidget>timezonelist=new ArrayList<>();
        timezonelist.add(waqtTimeTable);
        timezonelist.add(currentTime);

        List<IWidget>prayertimelist=new ArrayList<>();
        prayertimelist.add(prayerTimeTable);


        dependency.put(currentWaqt,currentwaqtlist);
        dependency.put(nextPrayer,nextprayerlist);
        dependency.put(location,locationlist);
        dependency.put(timezone,prayertimelist);

    }
void notify(IWidget widget){
    List<IWidget> dependents = dependency.get(widget);
    if(dependents!=null) {
        for (IWidget dependent : dependents) {
            dependent.update();
        }
    }

}

    @Override
    public void update() {
    }
}
