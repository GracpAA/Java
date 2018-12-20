package by.gsu.lab.beans.dao;


import by.gsu.lab.beans.Indication;

import java.util.List;


public interface DBIndicationDAO {
    public List<Indication> getIndications();
    public boolean createIndication(Indication indication);
    public void  deleteIndication(int id);
}
