package khabui.bit.fragmentphotos;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, 0,
                "https://image-us.eva.vn/upload/1-2021/images/2021-02-19/image1-1613707937-289-width600height400.jpg"));
        photos.add(new Photo(1, 0,
                "https://baokhanhhoa.vn/dataimages/201909/original/images5377069_hoa.jpg"));
        photos.add(new Photo(2, 0,
                "https://hoatuoithanhthao.com/media/ftp/hoa-huong-duong.jpg"));
        photos.add(new Photo(3, 1,
                "https://daohieu.com/wp-content/uploads/2020/05/con-tho-trang-co-mat-do-1024x910.jpg"));
        photos.add(new Photo(4, 1,
                "https://recmiennam.com/wp-content/uploads/2018/04/hinh-nen-dong-vat-hoang-da-49.jpg"));
        photos.add(new Photo(5, 1,
                "https://vnn-imgs-f.vgcloud.vn/2020/04/08/15/ban-co-the-doan-15-dong-vat-hoang-da-nay-la-15-em-be-khong-1.jpg"));
        photos.add(new Photo(6, 2,
                "https://images.squarespace-cdn.com/content/v1/53883795e4b016c956b8d243/1551438228969-H0FPV1FO3W5B0QL328AS/chup-anh-thuc-an-1.jpg"));
        photos.add(new Photo(7, 2,
                "https://cdn.tgdd.vn/2020/12/CookProduct/Thuc-an-nhanh-la-gi-tac-hai-cua-thuc-an-nhanh-va-cac-loai-tot-cho-suc-khoe-1-1200x676.jpg"));
        photos.add(new Photo(8, 2,
                "https://anh.24h.com.vn/upload/3-2016/images/2016-09-06/1473149955-thuc-an-nhanh.jpg"));
        return photos;
    }

    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for(int i = 0; i < phs.size(); i++){
            if(phs.get(i).getId() == id){
                return phs.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Photo> getPhotosByCategory(int category){
        ArrayList<Photo> allPhotos = generatePhotoData();
        ArrayList<Photo> photos = new ArrayList<Photo>();
        for(int i = 0; i < allPhotos.size(); i++){
            if(allPhotos.get(i).getCategory() == category){
                photos.add(allPhotos.get(i));
            }
        }
        return photos;
    }
}
