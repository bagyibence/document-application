package hu.example.documentapi;

import java.util.List;

public class ParagraphResponseDTO {
    private int total;
    private List<String> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
