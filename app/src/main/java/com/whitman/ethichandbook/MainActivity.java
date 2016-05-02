package com.whitman.ethichandbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.support.v7.app.ActionBarActivity;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static ExpandableListView expandableListView;
    private static ExpandableListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);

        // Setting group indicator null for custom indicator
        expandableListView.setGroupIndicator(null);

        setItems();
        setListener();

    }

    // Setting headers and childs to expandable listview
    void setItems() {

        // Array list for header
        ArrayList<String> header = new ArrayList<String>();

        // Array list for child items
        List<String> cfaachild = new ArrayList<String>();
        List<String> ecpachild = new ArrayList<String>();
        List<String> eeachild = new ArrayList<String>();
        List<String> wfachild = new ArrayList<String>();
        List<String> nspchild = new ArrayList<String>();
        List<String> itadachild = new ArrayList<String>();
        List<String> dmcachild = new ArrayList<String>();
        List<String> fourthachild = new ArrayList<String>();
        List<String> fifthachild = new ArrayList<String>();

        // Hash map for both header and child
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();

        // Adding headers to list
        //for (int i = 1; i < 5; i++) {
        //    header.add("Group " + i);

        //}
        // Data for the Computer Fraud and Abuse Act
        header.add("Computer Fraud and Abuse Act");
        cfaachild.add("\"The Computer Fraud and Abuse Act (CFAA) \n" +
                "makes it illegal for anyone to distribute computer code or " +
                "place it in the stream of commerce if they intend to cause " +
                "either damage or economic loss.\"\n" + "\n" +
                "The CFAA prohibits: \n" +
                "\t>Accessing a computer without authorization and transmitting classified government information. \n" + "\n" +
                "\t>Theft of financial information. \n" + "\n" +
                "\t>Accessing a \"protected computer,\" which is defined as any computer conntected" +
                "to the internet." + "\n" + "\n" +
                "\t>Computer fraud. \n" + "\n" +
                "\t>Transmitting code that causes damage to a computer system. \n" + "\n" +
                "\t>Trafficking in computer passwords for the purpose of affecting interstate commerce or a government computer. \" -[18 U.S. Code § 1030] \n" + "\n" +
                "Notable Cases: \n" +
                "United States v. Aaron Swartz, Sony Computer Entertainment America v. George Hotz");
        hashMap.put(header.get(0), cfaachild);

        //Data for the Electronic Communications Privacy Act
        header.add("Electronic Communications Privacy Act");
        ecpachild.add("\"The Electronic Communications Privacy Act (ECPA) protects against the unlawful interceptions of any wire" +
                "communications. Wire communications include telephone and cell phone conversations, " +
                "voicemail, email, messages stored on servers, as well as any other data sent over the wires.\" -[18 U.S.C. Sections 2510-2521, 2701-2710] \n" + "\n" +
                "Notable Cases: \n" +
                "Katz v United States");
        hashMap.put(header.get(1), ecpachild);

        //Data for the Economic Espionage Act
        header.add("Economic Espionage Act");
        eeachild.add("\"The Economic Espionage Act (EEA) makes it a federal crime to take, download, receive," +
                " or possess trade secret information obtained without the owner's authorization.\" -[18 U.S. Code § 1831]\n" + "\n" +
                "Notable Cases: \n" +
                "United States v. Liew");
        hashMap.put(header.get(2), eeachild);

        //Data for the Wire Fraud Act
        header.add("Wire Fraud Act");
        wfachild.add("\"The Wire Fraud Act (WFA) makes it illegal to use interstate wire " +
                "communications systems, which ostensibly includes the internet, " +
                "to commit a fraud to obtain money or property.\" -[18 U.S. Code § 1343] \n" + "\n" +
                "Notable Cases: \n" +
                "Skilling v. United States");
        hashMap.put(header.get(3), wfachild);

        //Data for the National Stolen Property Act
        header.add("National Stolen Property Act");
        nspchild.add("\"The National Stolen Property Act (NSPA) prohibits the transportation in interstate " +
                "commerce of \"any goods, wares, securities, or money\" valued at $5,000 or more" +
                " that are known to be stolen or fraudulently obtained.\" -[18 U.S. Code § 2314]\n" + "\n" +
                "Notable Cases: \n" +
                "United states v Schultz");
        hashMap.put(header.get(4), nspchild);

        //Data for the Identity Theft and Assumption Deterrence Act
        header.add("Identity Theft and Assumption Deterrence Act");
        itadachild.add("\"The Identity Theft and Assumption Deterrence Act (ITADA)" +
                "  criminalizes identity theft and states that whomever knowingly " +
                "transfers or uses, without lawful authority, a means of identification" +
                " of another person with the intent to commit, or otherwise promote, carry on, " +
                "or facilitate any unlawful activity that constitutes a violation of federal law \" -[18 U.S. Code § 1028]");
        hashMap.put(header.get(5), itadachild);

        //Data for Digital Millennium Copyright Act
        header.add("Digital Millennium Copyright Act");
        dmcachild.add("\"The Digital Millennium Copyright Act (DMCA)" +
                "criminalizes production and dissemination of technology," +
                " devices, or services intended to circumvent measures " +
                " that control access to copyrighted works. \" -[17 U.S. Code § 512] \n" + "\n" +
                "Notable Cases: \n" +
                "Sony v. George Hotz, Viacom Inc. v. YouTube, Google Inc, Lenz v. Universal Music Corp");
        hashMap.put(header.get(6), dmcachild);

        //Data for the Fourth Amendment
        header.add("The Fourth Amendment");
        fourthachild.add("\"The Fourth Amendment of the Constitution protects " +
                "the right of the people to be secure in their persons, houses, " +
                "papers, and effects, against unreasonable searches and seizures," +
                " shall not be violated, and no Warrants shall issue, but upon probable cause, " +
                "supported by Oath or affirmation, and particularly describing the" +
                " place to be searched, and the persons or things to be seized.\"");
        hashMap.put(header.get(7), fourthachild);
        adapter = new ExpandableListAdapter(MainActivity.this, header, hashMap);

        //Data for the Fourth Amendment
        header.add("The Fifth Amendment");
        fifthachild.add("\"The Fifth Amendment of the Constitution states: " +
                "No person shall be held to answer for a capital, or" +
                " otherwise infamous crime, unless on a presentment or " +
                "indictment of a grand jury, except in cases arising in the" +
                " land or naval forces, or in the militia, when in actual " +
                "service in time of war or public danger; nor shall any person" +
                " be subject for the same offense to be twice put in jeopardy" +
                " of life or limb; nor shall be compelled in any criminal case to " +
                "be a witness against himself, nor be deprived of life, liberty, " +
                "or property, without due process of law; nor shall private " +
                "property be taken for public use, without just compensation.\"");
        hashMap.put(header.get(8), fifthachild);

        adapter = new ExpandableListAdapter(MainActivity.this, header, hashMap);
        // Setting adpater over expandablelistview
        expandableListView.setAdapter(adapter);
    }

    // Setting different listeners to expandablelistview
    void setListener() {

        // This listener will show toast on group click
        expandableListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView listview, View view,
                                        int group_pos, long id) {

                Toast.makeText(MainActivity.this,
                        "You clicked : " + adapter.getGroup(group_pos),
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // This listener will expand one group at one time
        // You can remove this listener for expanding all groups
        expandableListView
                .setOnGroupExpandListener(new OnGroupExpandListener() {

                    // Default position
                    int previousGroup = -1;

                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (groupPosition != previousGroup)

                            // Collapse the expanded group
                            expandableListView.collapseGroup(previousGroup);
                        previousGroup = groupPosition;
                    }

                });

        // This listener will show toast on child click
        expandableListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView listview, View view,
                                        int groupPos, int childPos, long id) {
                Toast.makeText(
                        MainActivity.this,
                        "You clicked : " + adapter.getChild(groupPos, childPos),
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}