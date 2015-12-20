package com.pb.msg.busentity;

public class BusEntity {

    private  String sid;
    private  String busId;
    private  String deparLogin;
    private  String respPerson;
    private  String email;
    private  String descr;
    private  String answer;


    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
        
    public BusEntity(String sid, String busId, String deparLogin, String respPerson, String email,  String descr, String answer) {
        this.sid = sid;
        this.busId = busId;
        this.deparLogin = deparLogin;
        this.respPerson = respPerson;
        this.email = email;
        this.descr = descr;
        this.answer = answer;
        
    }



    public String getSid() {
        return sid;
    }

    public String getBusId() {
        return busId;
    }

    public String getDeparLogin() {
        return deparLogin;
    }

    public String getRespPerson() {
        return respPerson;
    }

    public String getEmail() {
        return email;
    }

    public String getDescr() {
        return descr;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public void setDeparLogin(String deparLogin) {
        this.deparLogin = deparLogin;
    }

    public void setRespPerson(String respPerson) {
        this.respPerson = respPerson;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Greeting{" + "sid=" + sid + ", busId=" + busId + ", deparLogin=" + deparLogin + ", respPerson=" + respPerson + ", email=" + email + ", descr=" + descr + '}';
    }


}
