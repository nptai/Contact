package com.nptai95.contact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Contact> contacts = getContactList();
        ContactAdapter contactAdapter = new ContactAdapter(this, contacts);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(contactAdapter);
    }

    private ArrayList<Contact> getContactList() {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("nptai95@gmail.com", "Nguyen Phat Tai", "0939811556"));
        contacts.add(new Contact("nptai95@gmail.com", "Nguyen Thanh An", "0939811556"));
        contacts.add(new Contact("nptai95@gmail.com", "Dinh Quang Hieu", "0939811556"));

        return contacts;
    }
}
