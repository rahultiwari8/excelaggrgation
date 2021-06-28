package pojo;

import org.apache.poi.ss.usermodel.Row;

public class Model {

    String icccode;
    int senderamount;

    int receiveramount;
    String cusip;
    String fxtrade;

    public int getAggreagtcount() {
        return aggreagtcount;
    }

    public void setAggreagtcount(int aggreagtcount) {
        this.aggreagtcount = aggreagtcount;
    }

    int aggreagtcount;

    public int getSenderamount() {
        return senderamount;
    }

    public void setSenderamount(int senderamount) {
        this.senderamount = senderamount;
    }

    public String getIcccode() {
        return icccode;
    }

    public void setIcccode(String icccode) {
        this.icccode = icccode;
    }





    public int getReceiveramount() {
        return receiveramount;
    }

    public void setReceiveramount(int receiveramount) {
        this.receiveramount = receiveramount;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getFxtrade() {
        return fxtrade;
    }

    public void setFxtrade(String fxtrade) {
        this.fxtrade = fxtrade;
    }

    public void assignEmployee(Row row){
        icccode = row.getCell(0).toString();
        String senderamountStr = row.getCell(1).toString();
        senderamount = (int)Double.parseDouble(senderamountStr);

        String receiveramountStr  = row.getCell(2).toString();
        receiveramount = (int)Double.parseDouble(receiveramountStr);




        cusip = row.getCell(3).toString();
        fxtrade = row.getCell(4).toString();

    }

    @Override
    public String toString() {
        return "Model{" +
                "icccode='" + icccode + '\'' +
                ", senderamount=" + senderamount +
                ", receiveramount=" + receiveramount +
                ", cusip='" + cusip + '\'' +
                ", fxtrade='" + fxtrade + '\'' +
                ", aggreagtcount=" + aggreagtcount +
                '}';
    }
}

