/*
 * Institut Supérieur Industriel Liégeois - Département ingénieurs industriels
 * Copyright 2015 Mawet Xavier. All rights reserved.
 * http://www.nakim.be
 */
package dragdrop;

import java.io.File;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

/**
 *
 * @author Nakim
 */
public class MultipleDragDropEvent extends EventObject
{
    //<editor-fold defaultstate="collapsed" desc="Variables declaration">
    protected List<File> files;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public MultipleDragDropEvent(Object source)
    {
        this(source, new ArrayList<File>());
    }

    public MultipleDragDropEvent(Object source, List<File> files)
    {
        super(source);
        this.files = files;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public methods">
    public void addFile(File file)
    {
        if (!this.files.contains(file))
            this.files.add(file);
    }

    public boolean removeFile(File file)
    {
        return this.files.remove(file);
    }

    public List<File> getFiles()
    {
        return this.files;
    }

    public File getFile(int index)
    {
        return this.files.get(index);
    }

    public int count()
    {
        return this.files.size();
    }
    //</editor-fold>
}
