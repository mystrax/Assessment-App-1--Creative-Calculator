package com.example.assessment1_creativecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val dropdownlist1= arrayOf("Red", "Yellow","Blue")
    val dropdownlist2= arrayOf("Red", "Yellow","Blue","Orange","Violet","Green")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2=ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)




        var b1=findViewById(R.id.button) as Button


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        elements1.adapter=adapter
        elements1.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(elements1.selectedItemPosition==0)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==1)
                {
                    textView.setText(" " + elements1.selectedItem)

                }
                if(elements1.selectedItemPosition==2) {
                    textView.setText(" " + elements1.selectedItem)

                }
            }
        }

        //setting the 2nd spinner
        elements2.adapter=adapter2
        elements2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long)
            {
                if(elements2.selectedItemPosition==0)
                {
                    textView.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==1)
                {
                    textView.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==2)
                {
                    textView.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==3)
                {
                    textView.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==4)
                {
                    textView.setText(" " + elements2.selectedItem)

                }
                if(elements2.selectedItemPosition==5)
                {
                    textView.setText(" " + elements2.selectedItem)

                }
            }
        }

        //Once the user clicks the button, following text should be displayed based on the selected //items position in relevant array
        b1.setOnClickListener{
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==0)
            {
                textView3.setText("The result is: Red")
            }
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==1)
            {
                textView3.setText("The result is: Orange")
            }
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==2)
            {
                textView3.setText("The result is: Violet")
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==0)
            {
                textView3.setText("The result is: Orange")
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==1)
            {
                textView3.setText("The result is: Yellow")
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==2)
            {
                textView3.setText("The result is: Green")
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==0)
            {
                textView3.setText("The result is: Violet")
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==1)
            {
                textView3.setText("The result is: Green")
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==2)
            {
                textView3.setText("The result is: Blue")
            }
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==3)
            {
                textView3.setText("The result is: Red Orange")
            }
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==4)
            {
                textView3.setText("The result is: Magenta")
            }
            if(elements1.selectedItemPosition==0 && elements2.selectedItemPosition==5)
            {
                textView3.setText("The result is: Brown")
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==3)
            {
                textView3.setText("The result is: Yellow Orange")
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==4)
            {
                textView3.setText("The result is: Lighter Brown")
            }
            if(elements1.selectedItemPosition==1 && elements2.selectedItemPosition==5)
            {
                textView3.setText("The result is: Yellow Green")
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==3)
            {
                textView3.setText("The result is: Brown")
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==4)
            {
                textView3.setText("The result is: Blue-Violet")
            }
            if(elements1.selectedItemPosition==2 && elements2.selectedItemPosition==5)
            {
                textView3.setText("The result is: Blue Green")
            }

        }
    }
}

