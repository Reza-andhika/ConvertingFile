/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.tools;

import com.BTS.converter.entities.DetailData;
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
public class Method {

    @Autowired
    DetailDataService service;

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
            Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void renameExtension(String path, String fileName) {
        File myfile = new File(path + "/" + fileName);
        myfile.renameTo(new File(path + "/" + fileName + ".NACK"));
    }
}
