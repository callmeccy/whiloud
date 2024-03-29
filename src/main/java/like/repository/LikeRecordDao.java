package like.repository;

import java.util.List;

import like.model.LikeRecordBean;
import post.model.RecordBean;
import register.model.MemberBean;

public interface LikeRecordDao {

	public List<LikeRecordBean> getLikeCountByMemberNo(Integer memberNo);

	public void likeRecord(MemberBean mb, RecordBean rb);

	public void dislikeRecord(MemberBean mb, RecordBean rb);

	public List<LikeRecordBean> getLikeListByMemberNo(Integer memberNo);


}
