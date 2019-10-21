/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.tools;

import com.BTS.converter.entities.ClientPartner;
import com.BTS.converter.entities.DetailData;
import com.BTS.converter.entities.HistoryFile;
import com.BTS.converter.entities.Parameter;
import com.BTS.converter.entities.Type;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import com.BTS.converter.services.DetailDataService;
import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Reza
 */
public class Methods {

    @Autowired
    DetailDataService service;

    public void readCsvUsingLoad(String path, String filename, String delimiter) {
        try (Connection connection = DBConnection.getConnection()) {
            String loadQuery = "LOAD DATA LOCAL INFILE '" + path+"/"+filename + "' INTO TABLE temp FIELDS "
                    + "TERMINATED BY '" + delimiter + "'" + " LINES TERMINATED BY '\r\n' (Field_1,\n"
                    + "             Field_2,\n"
                    + "             Field_3,\n"
                    + "             Field_4,\n"
                    + "             Field_5,\n"
                    + "             Field_6,\n"
                    + "             Field_7,\n"
                    + "             Field_8,\n"
                    + "             Field_9,\n"
                    + "             Field_10) ";
            System.out.println(loadQuery);
            Statement stmt = connection.createStatement();
            stmt.execute(loadQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void converting(String path, String filename) {

        File file = new File(path);
        List<String> temp = new ArrayList<>();
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String e = "";
        String f = "";
        String g = "";
        String h = "";
        String i = "";
        String j = "";

        for (DetailData detail : service.getAll()) {
            System.out.println("Try -> " + detail.getField1() + "_" + detail.getField2() + "_"
                    + detail.getField3() + "_"
                    + detail.getField4() + "_"
                    + detail.getField4() + "_"
                    + detail.getField5() + "_"
                    + detail.getField6() + "_"
                    + detail.getField7() + "_"
                    + detail.getField8() + "_"
                    + detail.getField9() + "_"
                    + detail.getField10() + ";");
            a = detail.getField1();
            b = detail.getField2();
            c = detail.getField3();
            d = detail.getField4();
            e = detail.getField5();
            f = detail.getField6();
            g = detail.getField7();
            h = detail.getField8();
            i = detail.getField9();
            j = detail.getField10();

            if (a.equalsIgnoreCase("")) {
                a = " ";
                if (b.equalsIgnoreCase("")) {
                    b = " ";
                    if (c.equalsIgnoreCase("")) {
                        c = " ";
                        if (d.equalsIgnoreCase("")) {
                            d = " ";
                            if (e.equalsIgnoreCase("")) {
                                e = " ";
                                if (f.equalsIgnoreCase("")) {
                                    f = " ";
                                    if (g.equalsIgnoreCase("")) {
                                        g = " ";
                                        if (h.equalsIgnoreCase("")) {
                                            h = " ";
                                            if (i.equalsIgnoreCase("")) {
                                                i = " ";
                                                if (j.equalsIgnoreCase("")) {
                                                    j = " ";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (b.equalsIgnoreCase("")) {
                b = " ";
                if (c.equalsIgnoreCase("")) {
                    c = " ";
                    if (d.equalsIgnoreCase("")) {
                        d = " ";
                        if (e.equalsIgnoreCase("")) {
                            e = " ";
                            if (f.equalsIgnoreCase("")) {
                                f = " ";
                                if (g.equalsIgnoreCase("")) {
                                    g = " ";
                                    if (h.equalsIgnoreCase("")) {
                                        h = " ";
                                        if (i.equalsIgnoreCase("")) {
                                            i = " ";
                                            if (j.equalsIgnoreCase("")) {
                                                j = " ";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (c.equalsIgnoreCase("")) {
                c = " ";
                if (d.equalsIgnoreCase("")) {
                    d = " ";
                    if (e.equalsIgnoreCase("")) {
                        e = " ";
                        if (f.equalsIgnoreCase("")) {
                            f = " ";
                            if (g.equalsIgnoreCase("")) {
                                g = " ";
                                if (h.equalsIgnoreCase("")) {
                                    h = " ";
                                    if (i.equalsIgnoreCase("")) {
                                        i = " ";
                                        if (j.equalsIgnoreCase("")) {
                                            j = " ";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (d.equalsIgnoreCase("")) {
                d = " ";
                if (e.equalsIgnoreCase("")) {
                    e = " ";
                    if (f.equalsIgnoreCase("")) {
                        f = " ";
                        if (g.equalsIgnoreCase("")) {
                            g = " ";
                            if (h.equalsIgnoreCase("")) {
                                h = " ";
                                if (i.equalsIgnoreCase("")) {
                                    i = " ";
                                    if (j.equalsIgnoreCase("")) {
                                        j = " ";
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (e.equalsIgnoreCase("")) {
                e = " ";
                if (f.equalsIgnoreCase("")) {
                    f = " ";
                    if (g.equalsIgnoreCase("")) {
                        g = " ";
                        if (h.equalsIgnoreCase("")) {
                            h = " ";
                            if (i.equalsIgnoreCase("")) {
                                i = " ";
                                if (j.equalsIgnoreCase("")) {
                                    j = " ";
                                }
                            }
                        }
                    }
                }
            } else if (f.equalsIgnoreCase("")) {
                f = " ";
                if (g.equalsIgnoreCase("")) {
                    g = " ";
                    if (h.equalsIgnoreCase("")) {
                        h = " ";
                        if (i.equalsIgnoreCase("")) {
                            i = " ";
                            if (j.equalsIgnoreCase("")) {
                                j = " ";
                            }
                        }
                    }
                }
            } else if (g.equalsIgnoreCase("")) {
                g = " ";
                if (h.equalsIgnoreCase("")) {
                    h = " ";
                    if (i.equalsIgnoreCase("")) {
                        i = " ";
                        if (j.equalsIgnoreCase("")) {
                            j = " ";
                        }
                    }
                }
            } else if (h.equalsIgnoreCase("")) {
                h = " ";
                if (i.equalsIgnoreCase("")) {
                    i = " ";
                    if (j.equalsIgnoreCase("")) {
                        j = " ";
                    }
                }
            } else if (i.equalsIgnoreCase("")) {
                i = " ";
                if (j.equalsIgnoreCase("")) {
                    j = " ";
                }
            } else if (j.equalsIgnoreCase("")) {
                j = " ";
            }

            temp.add(a + "_");
            temp.add(b + "_");
            temp.add(c + "_");
            temp.add(d + "_");
            temp.add(e + "_");
            temp.add(f + "_");
            temp.add(g + "_");
            temp.add(h + "_");
            temp.add(i + "_");
            temp.add(j + ";");
        }
        FileWriter fileWriter;
        try {
            if (file.createNewFile()) {
                fileWriter = new FileWriter(file);
                for (String str : temp) {
                    System.out.println("File is created");
                    fileWriter.write(str);
                    System.out.print(str);
                }
                fileWriter.close();
            } else {
                System.out.println("File already exist");
            }
        } catch (IOException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void renameExtension(String path, String fileName) {
        File myfile = new File(path + "/" + fileName);
        myfile.renameTo(new File(path + "/" + fileName + ".NACK"));
    }
    
    public ClientPartner clientSave(String id,String name,String parameter,String type){
        ClientPartner clients = new ClientPartner();
        Parameter params = new Parameter();
        Type types = new Type();
        
        clients.setId(id);
        clients.setName(name);
        
        params.setId(Integer.parseInt(parameter));
        clients.setParameter(params);
        
        types.setId(type);
        clients.setType(types);
        return clients;
    }
    
    public Parameter saveParam(String symbol){
        Parameter param = new Parameter();
        
        param.setSymbol(symbol);
        return param;
    }
    
    public Type saveType(String id,String name){
        Type type = new Type();
        
        type.setId(id);
        type.setName(name);
        return type;
    }
    
    public HistoryFile saveHistory(String id, String oldpath, String oldfilename, String newpath, String newfilename, String client){
        HistoryFile history = new HistoryFile();
        ClientPartner clients = new ClientPartner();
        
        history.setId(id);
        history.setOldPath(oldpath);
        history.setOldFilename(oldfilename);
        history.setNewPath(newpath);
        history.setNewFilename(newfilename);
        
        clients.setId(client);
        history.setClient(clients);
        
        return history;
    }
    
    public String id_for_type(String str){
        String first = str.substring(0,1);
        String mid = middle(str);
        String last = str.substring(str.length()-1);
        
        String temp = first+""+mid+""+last;
        System.out.println(temp);
        return temp;
    }
    
    public String id_for_client(String str){
        String mid = middle(str);
        String last = str.substring(str.length()-1);
        
        String temp = mid+""+last;
        System.out.println(temp);
        return temp;
    }
    
    public static String middle(String str)
    {
        int position;
        int length;
        
        if (str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length = 1;
        }else{
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }

//
//    public void readCsvUsingLoad(String OldPath, List<String> delim) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
