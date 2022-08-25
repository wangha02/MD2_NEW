package service.like;

import config.Config;
import model.LikeStory;
import model.Story;

import java.util.ArrayList;
import java.util.List;


public class LikeServiceIMPL implements ILikeService {

    static String PATH_LIKE = "C:\\Users\\Admin\\Downloads\\MD2-Role-master\\src\\database\\like.txt";

    static Config<List<LikeStory>> config = new Config<>();

    static List<LikeStory> likeList = config.read(PATH_LIKE);

    static {
        if (likeList == null) {
            likeList = new ArrayList<>();
        }
    }

    @Override
    public List<LikeStory> findAll() {
        return likeList;
    }

    @Override
    public List<Story> save(LikeStory like) {
        likeList.add(like);
        updateData();
        return null;
    }

    @Override
    public void remove(int id) {
        likeList.remove(findById(id));
        updateData();
    }

    @Override
    public LikeStory findById(int id) {
        for (LikeStory like : likeList) {
            if (like.getId() == id) {
                return like;
            }
        }
        return null;
    }

    @Override
    public void updateData() {
        config.write(PATH_LIKE, likeList);

    }

    @Override
    public void deleteById(int id) {
    }
}
