package com.example.term_project.board.exam_board;

import static com.example.term_project.network.NetworkModule.getRetrofit;

import android.util.Log;

import com.example.term_project.board.exam_board.request.PatchExamSubjectRequest;
import com.example.term_project.board.exam_board.request.PostExamSubjectRequest;
import com.example.term_project.board.exam_board.response.GetExamSubjectResponse;
import com.example.term_project.board.exam_board.response.PatchExamSubjectResponse;
import com.example.term_project.board.exam_board.response.PostExamSubjectResponse;
import com.example.term_project.view.GetExamSubjectsView;
import com.example.term_project.view.PatchExamSubjectView;
import com.example.term_project.view.PostExamSubjectView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ExamSubjectService {
    private final ExamSubjectRetrofitInterface examSubjectService = getRetrofit().create(ExamSubjectRetrofitInterface.class);
    private GetExamSubjectsView getExamSubjectsView;
    private PostExamSubjectView postExamSubjectView;
    private PatchExamSubjectView patchExamSubjectView;

    public void setGetExamSubjectsView(GetExamSubjectsView getExamSubjectsView){
        this.getExamSubjectsView = getExamSubjectsView;
    }
    public void setPostExamSubjectView(PostExamSubjectView postExamSubjectView){
        this.postExamSubjectView = postExamSubjectView;
    }
    public void setPatchExamSubjectView(PatchExamSubjectView patchExamSubjectView){
        this.patchExamSubjectView = patchExamSubjectView;
    }
    // GET
    public void getExamSubjects(String jwt){
        examSubjectService.getExamSubjects(jwt).enqueue(new Callback<GetExamSubjectResponse>() {
            @Override // 응답이 왔을 때
            public void onResponse(Call<GetExamSubjectResponse> call, Response<GetExamSubjectResponse> response) {
                GetExamSubjectResponse resp = response.body();
                assert resp != null;
                if(resp.getCode() == 1000){
                    getExamSubjectsView.onGetExamSubjectSuccess(resp.getCode(),resp.getResult());
                }else{
                    getExamSubjectsView.onGetExamSubjectFailure(resp.getCode(),resp.getMessage());
                }
            }
            @Override // 네트워크 연결 실패 시
            public void onFailure(Call<GetExamSubjectResponse> call, Throwable t) {
                Log.d("GET-EXAM-SUBJECTS/FAIL", t.getMessage());
            }
        });
        Log.d("GET-EXAM-SUBJECTS","HELLO");
    }
    // POST
    public void postExamSubject(String jwt, PostExamSubjectRequest postExamSubjectRequest){
        examSubjectService.postExamSubject(jwt,postExamSubjectRequest).enqueue(new Callback<PostExamSubjectResponse>() {
            @Override
            public void onResponse(Call<PostExamSubjectResponse> call, Response<PostExamSubjectResponse> response) {
                PostExamSubjectResponse resp = response.body();
                assert resp != null;
                if(resp.getCode() == 1000){
                    postExamSubjectView.onPostExamSubjectSuccess();
                }else{
                    postExamSubjectView.onPostExamSubjectFailure(resp.getCode(), resp.getMessage());
                }
            }

            @Override
            public void onFailure(Call<PostExamSubjectResponse> call, Throwable t) {
                Log.d("POST-EXAM-SUBJECT/FAIL", t.getMessage());
            }
        });
    }
    //patch
    public void patchExamSubject(String jwt, int listIdx,PatchExamSubjectRequest patchExamSubjectRequest){
        examSubjectService.patchExamSubject(jwt,listIdx,patchExamSubjectRequest).enqueue(new Callback<PatchExamSubjectResponse>() {
            @Override
            public void onResponse(Call<PatchExamSubjectResponse> call, Response<PatchExamSubjectResponse> response) {
                PatchExamSubjectResponse resp = response.body();
                assert resp != null;
                if(resp.getCode() == 1000){
                    patchExamSubjectView.onPatchExamSubjectSuccess();
                }else{
                    patchExamSubjectView.onPatchExamSubjectFailure(resp.getCode(),resp.getMessage());
                }
            }

            @Override
            public void onFailure(Call<PatchExamSubjectResponse> call, Throwable t) {
                Log.d("PATCH-EXAM-SUBJECT/FAIL", t.getMessage());
            }
        });
    }
}
