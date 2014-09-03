package org.apache.jetspeed.om.dbregistry.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;

/**
  *  This class was autogenerated by Torque on:
  *
  * [Thu Jun 10 23:17:32 JST 2004]
  *
  */
public class PortletParameterMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "org.apache.jetspeed.om.dbregistry.map.PortletParameterMapBuilder";


    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public void doBuild() throws TorqueException
    {
        dbMap = Torque.getDatabaseMap("default");

        dbMap.addTable("PORTLET_PARAMETER");
        TableMap tMap = dbMap.getTable("PORTLET_PARAMETER");

        tMap.setPrimaryKeyMethod(TableMap.NATIVE);

        tMap.setPrimaryKeyMethodInfo("PORTLET_PARAMETER");

              tMap.addPrimaryKey("PORTLET_PARAMETER.ID", new Long(0));
                    tMap.addColumn("PORTLET_PARAMETER.NAME", new String());
                    tMap.addColumn("PORTLET_PARAMETER.VALUE", new String());
                    tMap.addColumn("PORTLET_PARAMETER.TYPE", new String());
                    tMap.addColumn("PORTLET_PARAMETER.HIDDEN", new Integer(0));
                    tMap.addColumn("PORTLET_PARAMETER.ROLE", new String());
                    tMap.addColumn("PORTLET_PARAMETER.CACHEDONVALUE", new Integer(0));
                    tMap.addColumn("PORTLET_PARAMETER.CACHEDONNAME", new Integer(0));
                    tMap.addColumn("PORTLET_PARAMETER.TITLE", new String());
                    tMap.addColumn("PORTLET_PARAMETER.DESCRIPTION", new String());
                    tMap.addColumn("PORTLET_PARAMETER.IMAGE", new String());
                    tMap.addForeignKey(
                "PORTLET_PARAMETER.PORTLET_ID", new Long(0) , "PORTLET" ,
                "ID");
                    tMap.addColumn("PORTLET_PARAMETER.SECURITY", new String());
          }
}
