package main.java.service.impl;

import main.java.bean.Medecine;
import main.java.bean.MedecineUser;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

class MedecineServiceImplTest {
    public static void main(String[] args) {
        userRegister();
        findAllTest();
        findByIdTest();
        findByNameTest();
    }

    @Test
    public static void findAllTest() {
        List<Medecine> m_list = new ArrayList<Medecine>();
        MedecineServiceImpl ms = new MedecineServiceImpl();
        m_list = ms.findAll();
        for (Medecine me : m_list) {
            System.out.println(me.toString());
        }

    }

    @Test
    public static void findByIdTest() {
        Medecine me = new Medecine();
        MedecineServiceImpl ms = new MedecineServiceImpl();
        int mId = 1;
        me = ms.findById(mId);
        System.out.println(me.toString());
    }

    @Test
    public static void findByNameTest() {
        List<Medecine> m_list = new ArrayList<Medecine>();
        MedecineServiceImpl ms = new MedecineServiceImpl();
        String mName = "dangshen";
        m_list = ms.findByName(mName);
        for (Medecine me : m_list) {
            System.out.println(me.toString());
        }
    }

    @Test
    public static  void userRegister(){
        MedecineUser newmu = new MedecineUser();
        newmu.setUsername("1");
        newmu.setPassword("1");
        MedecineUserServiceImpl mus = new MedecineUserServiceImpl();
        System.out.println(mus.userRegister(newmu));
    }


}