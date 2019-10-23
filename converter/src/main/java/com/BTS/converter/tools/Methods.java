/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.tools;

import com.BTS.converter.entities.ClientPartner;
import com.BTS.converter.entities.DetailData;
import com.BTS.converter.entities.HistoryFile;
import com.BTS.converter.entities.ListData;
import com.BTS.converter.entities.Parameter;
import com.BTS.converter.entities.CorporateType;
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
import com.BTS.converter.repositories.ListDataRepository;
import com.BTS.converter.services.ListDataService;
import java.io.File;
import javax.swing.event.ListDataEvent;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Reza
 */
public class Methods {

    @Autowired
    DetailDataService service;

    @Autowired
    ListDataRepository dataRepo;

    @Autowired
    ListDataService dataService;

    public void converting(String path, String filename, String clientId) {
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

        DetailData details = new DetailData();
        ClientPartner clients = new ClientPartner();
        ListData listData = new ListData();
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

            //////////////////////////////////////////////
            listData.setField1(a);
            listData.setField2(b);
            listData.setField3(c);
            listData.setField4(d);
            listData.setField5(e);
            listData.setField6(f);
            listData.setField7(g);
            listData.setField8(h);
            listData.setField9(i);
            listData.setField10(j);

            clients.setId(clientId);
            listData.setClient(clients);

            dataService.save(listData);
            //////////////////////////////////////////////
        }

        for (ListData listdatas : dataRepo.getByClient(clientId)) {
            System.out.println("Try -> " + listdatas.getField1() + "_" + listdatas.getField2() + "_"
                    + listdatas.getField3() + "_"
                    + listdatas.getField4() + "_"
                    + listdatas.getField4() + "_"
                    + listdatas.getField5() + "_"
                    + listdatas.getField6() + "_"
                    + listdatas.getField7() + "_"
                    + listdatas.getField8() + "_"
                    + listdatas.getField9() + "_"
                    + listdatas.getField10() + ";");
            a = listData.getField1();
            b = listData.getField2();
            c = listData.getField3();
            d = listData.getField4();
            e = listData.getField5();
            f = listData.getField6();
            g = listData.getField7();
            h = listData.getField8();
            i = listData.getField9();
            j = listData.getField10();
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

        File file = new File(path + "/" + filename);
        File fileDir = new File(path);
        FileWriter fileWriter;
        try {
            if (!fileDir.exists()) {
                if (fileDir.mkdir()) {
                    System.out.println("Directory is created!");
                    if (file.createNewFile()) {
                        fileWriter = new FileWriter(file);
                        System.out.println("File is created");
                        for (String str : temp) {
                            fileWriter.write(str);
                            System.out.print(str);
                        }
                        fileWriter.close();
                    } else {
//                        renameExtension(path, filename);
                        System.out.println("File already exist");
                    }
                } else {
                    System.out.println("Directory is not created!");
                }
            } else {
                if (file.createNewFile()) {
                    fileWriter = new FileWriter(file);
                    System.out.println("File is created");
                    for (String str : temp) {
                        fileWriter.write(str);
                        System.out.print(str);
                    }
                    fileWriter.close();
                } else {

                    System.out.println("File already exist");
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Methods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void renameExtension(String path) {
        File oldfile = new File(path);
        int dotPos = path.lastIndexOf(".");
        String strExtension = path.substring(dotPos + 1);
        String strFilename = path.substring(0, dotPos);
        String strNewFileName = strFilename + "." + "NACK";
        System.out.println("filename -> " + strFilename);
        System.out.println("extension -> " + strExtension);
        System.out.println("newfilename -> " + strNewFileName);
        File newfile = new File(strNewFileName);
        oldfile.renameTo(newfile);
        boolean Rename = oldfile.renameTo(newfile);
        if (!Rename) {
            System.out.println("FileExtension hasn't been changed successfully.");
        } else {
            System.out.println("FileExtension has been changed successfully.");
        }
    }

    public void readCsvUsingLoad(String path, String delimiter) {
        try (Connection connection = DBConnection.getConnection()) {
            String loadQuery = "LOAD DATA LOCAL INFILE '" + path + "' INTO TABLE temp FIELDS "
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

    public void search(final String pattern, final File folder, List<String> result) {
        for (final File f : folder.listFiles()) {

            if (f.isDirectory()) {
                search(pattern, f, result);
            }

            if (f.isFile()) {
                if (f.getName().matches(pattern)) {
                    result.add(f.getAbsolutePath());
                }
            }

        }
    }

    public void inserts(String path, String delimiter) {
        final File folder = new File(path);
        List<String> result = new ArrayList<>();

        System.out.println(folder);
        search(".*\\.txt", folder, result);
        for (String paths : result) {
            String parsing_1 = paths;
            String parsing_2 = parsing_1.replaceAll("\\\\", "/");
            System.out.println(parsing_2);
            readCsvUsingLoad(parsing_2, delimiter);
            renameExtension(parsing_2);
        }
    }

    public ClientPartner saveClient(String id, String name, String incoming, String outgoing, String parameter, String type) {
        ClientPartner clients = new ClientPartner();
        Parameter params = new Parameter();
        CorporateType types = new CorporateType();

        clients.setId(id);
        clients.setName(name);
        clients.setIncomingPath(incoming);
        clients.setOutgoingPath(outgoing);

        params.setId(Integer.parseInt(parameter));
        clients.setParameter(params);

        types.setId(type);
        clients.setType(types);
        return clients;
    }

    public ListData saveListData(String Field_1, String Field_2, String Field_3, String Field_4, String Field_5, String Field_6, String Field_7, String Field_8, String Field_9, String Field_10, String client) {
        ListData listDatas = new ListData();
        ClientPartner clients = new ClientPartner();

        listDatas.setField1(Field_1);
        listDatas.setField2(Field_2);
        listDatas.setField3(Field_3);
        listDatas.setField4(Field_4);
        listDatas.setField5(Field_5);
        listDatas.setField6(Field_6);
        listDatas.setField7(Field_7);
        listDatas.setField8(Field_8);
        listDatas.setField9(Field_9);
        listDatas.setField10(Field_10);

        clients.setId(client);
        listDatas.setClient(clients);

        return listDatas;
    }

    public Parameter saveParam(String symbol) {
        Parameter param = new Parameter();

        param.setSymbol(symbol);
        return param;
    }

    public CorporateType saveType(String id, String name) {
        CorporateType type = new CorporateType();

        type.setId(id);
        type.setName(name);
        return type;
    }

    public HistoryFile saveHistory(String id, String oldpath, String newpath, String newfilename, String client) {
        HistoryFile history = new HistoryFile();
        ClientPartner clients = new ClientPartner();

        history.setId(id);
        history.setOldPath(oldpath);
        history.setNewPath(newpath);
        history.setNewFilename(newfilename);

        clients.setId(client);
        history.setClient(clients);

        return history;
    }

    public String id_for_type(String str) {
        String first = str.substring(0, 1);
        String mid = middle(str);
        String last = str.substring(str.length() - 1);

        String temp = first + "" + mid + "" + last;
        System.out.println(temp.toUpperCase());
        return temp;
    }

    public String id_for_client(String str) {
        String mid = middle(str);
        String last = str.substring(str.length() - 1);

        String temp = mid + "" + last;
        System.out.println(temp.toUpperCase());
        return temp;
    }

    public static String middle(String str) {
        int position;
        int length;

        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 1;
        } else {
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
