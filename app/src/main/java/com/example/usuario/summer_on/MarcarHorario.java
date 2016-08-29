package com.example.usuario.summer_on;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Usuario on 22/08/2016.
 */
public class MarcarHorario extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        String [] servicos = new String[] {"Massagem relaxante (muscular)","Axilas","Braços", "Peito",
                "Barriga", "Costas","Metade das costas","Glúteos","Virilha",
                "Virilha cavada","Virilha total", "Coxas", "Meia perna","Perna inteira"};

        ListView listView = (ListView) findViewById(R.id.mainListView1);
        ListAdapter adapter = new IAdapter(this,servicos);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent3 = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(intent3);
                        break;
                    case 1:
                        Intent q = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(q);
                        break;
                    case 2:
                        Intent w = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(w);
                        break;
                    case 3:
                        Intent e = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(e);
                        break;
                    case 4:
                        Intent r = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(r);
                        break;
                    case 5:
                        Intent t = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(t);
                        break;
                    case 6:
                        Intent y = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(y);
                        break;
                    case 7:
                        Intent u = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(u);
                        break;
                    case 8:
                        Intent leo = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(leo);
                        break;
                    case 9:
                        Intent o = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(o);
                        break;
                    case 10:
                        Intent p = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(p);
                        break;
                    case 11:
                        Intent a = new Intent(MarcarHorario.this,Marcando.class);
                        startActivity(a);
                        break;
                    case 12:
                        Intent s = new Intent(MarcarHorario.this, DataEHoraa.class);
                        startActivity(s);
                        break;
                    case 13:
                        Intent d = new Intent(MarcarHorario.this, DataEHoraa.class);
                        startActivity(d);
                        break;

                }
            }
        });
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_marcar) {
            Intent intent = new Intent(this,MarcarHorario.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.nav_agenda) {
            Intent intent1 = new Intent(this,Marcando.class);
            startActivity(intent1);
        } else if (id == R.id.nav_promocoes) {
            Intent intent2 = new Intent(this,Promocoes.class);
            startActivity(intent2);
        } else if (id == R.id.nav_sobre) {
            Intent intent3 = new Intent(this,QuemSomos.class);
            startActivity(intent3);
        } else if (id == R.id.nav_settings) {
            Intent intent4 = new Intent(this,Configuracoes.class);
            startActivity(intent4);
        } else if (id == R.id.nav_share) {
            Intent intent5 = new Intent(Intent.ACTION_SEND);
            intent5.setType("text/plain");
            intent5.putExtra(Intent.EXTRA_TEXT, "https://m.facebook.com/summer4on/");
            startActivity(intent5);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
class IAdapter extends ArrayAdapter<String>
{
    public IAdapter(Context context, String[] values)
    {
        super(context, R.layout.entry_marcar,values);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.entry_marcar,parent, false);
        String text = getItem(position);
        TextView servicoid = (TextView) view.findViewById(R.id.entryMarcarServicos);
        servicoid.setText(text);
        TextView precosid = (TextView) view.findViewById(R.id.entryMarcarPrecos);
        LinearLayout back = (LinearLayout) view.findViewById(R.id.backMarcar);

        if ("Massagem relaxante (muscular)".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("1 sessão: R$110 / 5 sessões: R$500");}
        if ("Axilas".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(android.R.drawable.ic_menu_my_calendar);
            precosid.setText("Feminino: R$20 / Masculino: R$25");}
        if ("Braços".equals(text)) {
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$35 / Masculino: R$40");}
        if ("Peito".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(android.R.drawable.picture_frame);
            precosid.setText("Masculino: R$40");}
        if ("Barriga".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$30 / Masculino: R$35");}
        if ("Costas".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$40 / Masculino: R$50");}
        if ("Metade das costas".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$25 / Masculino: R$35");}
        if ("Glúteos".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$30 / Masculino: R$35");}
        if ("Virilha".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$30 / Masculino: R$35");}
        if ("Virilha cavada".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$40");}
        if ("Virilha total".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$50");}
        if ("Coxas".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$30 / Masculino: R$35");}
        if ("Meia perna".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$30 / Masculino: R$35");}
        if ("Perna inteira".equals(text)) {
            //mudar os backgrounds
            back.setBackgroundResource(R.drawable.ic_menu_send);
            precosid.setText("Feminino: R$50 / Masculino: R$60");}
        return view;
    }

}