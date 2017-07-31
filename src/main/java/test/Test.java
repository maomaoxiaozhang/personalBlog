package test;

import dao.CRUD;
import model.AdminEntity;

/**
 * Created by zhanggq on 2017/7/31.
 */
public class Test {
    public static void main(String[] args){
        CRUD crud = new CRUD();
        AdminEntity adminEntity = crud.research();
        System.out.println(adminEntity.getLastLogin());
    }
}
