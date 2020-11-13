package com.barbaburguer.aplicativoatmconsultoria.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.barbaburguer.aplicativoatmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String descricao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.+" +
                " Fusce ultricies mi eu vestibulum ornare. Etiam scelerisque orci vitae blandit lacinia. +" +
                "Nullam ac dictum odio. Sed hendrerit fermentum gravida. Duis pharetra tempor elementum. +" +
                "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. +" +
                "Quisque dignissim et ipsum quis rutrum. Suspendisse vestibulum scelerisque libero sit amet aliquet.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        View view = new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br","envie um e-mail")
                .addWebsite("www.google.com.br", "acesse nosso site")
                .addGroup("Redes Sociais")
                .addFacebook("BarbaBurguerCampina","Facebook")
                .addInstagram("barbaburguercampinas","Instagram")
                .addTwitter("VictorGHWOR","Twitter")
                .addGitHub("vvvictorgm","GitHub")
                .addYoutube("UCcCH7igA0yLcJZYWnl1tENw","Youtube")
                .addPlayStore("com.instagram.android","DonwloadAPP")

                .addItem(versao)


                .create();

        return view;

        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }

}
