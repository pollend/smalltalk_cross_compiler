import java.util.ArrayList;
import java.util.List;

/**
 * Created by michaelpollind on 11/28/16.
 */
public class ResultBlock implements IBaseValue {


    private int groupPadding= 0;
    private List<IBaseValue> entries = new ArrayList<>();
    public boolean shiftLeft = false;
    public ResultBlock(boolean shiftLeft)
    {
        this.shiftLeft = shiftLeft;
    }

    public  void setGroupPadding(int groupPadding)
    {
        this.groupPadding = groupPadding;
    }
    public  int getGroupPadding()
    {
        return  groupPadding;
    }


    public  void  append(IBaseValue entry)
    {
        entries.add(entry);
    }

    @Override
    public List<String> getResult() {
        List<String> result = new ArrayList<>();
        for(int x = 0; x < entries.size(); x++)
        {
            List<String> entry = entries.get(x).getResult();
            for(int y = 0; y < entry.size(); y++)
            {
                if(shiftLeft)
                    result.add(' ' + entry.get(y));
                else
                    result.add(entry.get(y));

            }
        }
        return result;
    }


//    public List<String>  getResult()
//    {
//        List<String> entry = new ArrayList<String>();
//        for(int x = 0; x < entries.size();x++)
//        {
//            entry.add(entries.get(x).getResult());
//        }
//        return  entry;
//    }
}