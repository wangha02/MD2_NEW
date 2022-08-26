package service.like;


import model.Like;
import service.IGenericService;

public interface ILikeService extends IGenericService<Like> {
        int getLikeNumberByStoryId(int id);

        boolean checkLike(int id);

//        void delete(int id);
}
