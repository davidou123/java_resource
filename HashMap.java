
import java.util.*;
 
public class HashMap {
    public static void main(String[] args) {
        Map<String, String> map = 
                        new HashMap<String, String>();
        
        map.put("�p��", "�k��");
        map.put("�p��", "�k��");
        
        System.out.println(map.get("�p��"));
        System.out.println(map.get("�p��"));
    }
} 
//clear			-�����Ҧ��M�g���Y
//containsKey	-�P�_�O�_�]�t���wkey
//containValue	-�P�_�O�_�]�t���wvalue
//equals		-�P�_�O�_�P���w����ۦP
//get			-�Ǧ^���wkey�ҬM�g��value
//isEmpty		-�P�_�O�_����
//keySet		-��omap���X�Ҧ���key
//put			-�V���w���ަ�m�W�[����
//putAll		-�l�[�t�@��map�����ثemap���X
//remove		-����map���X�����wkey�����e
//size			-��omap���X���O���j�p
//valuse		-��o map���X���Ҧ���Ȫ���
