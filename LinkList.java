import java.util.LinkedList;
import java.util.Vector;

public class LinkList
{
  public static void main(String[] arg)
  {
    //��ϤƤ@�����
    LinkedList head = new LinkedList();
    int size = 0;
    head.add("�}�C1");
    head.add("�}�C2");
    head.add("�}�C3!");
    head.add(2, "�}�C4");  //���ĤG�Ӧ�m �q0�}�l
    //���|�۰ʥιM�����覡���L�Ҧ����e
    System.out.println(head);
    System.out.println("-------");
    
    //�Q��Vector�Ϊ̬OArrayList��Collection������[�ƾ�
    Vector v = new Vector();
    //�VVector���[�J�F��
    v.add("Vector1");
    v.add("Vector2");
    //�N��eVector�[�b��e����̫�
    head.addAll(v);
    System.out.println(head);
    
    //�N��eVector�[�b��e������w��m
    head.addAll(2, v);
    System.out.println(head);
    System.out.println("-------");
    //�L���w��m�����e
    System.out.println(head.get(2));
    head.addFirst("�Ĥ@��");
    System.out.println(head);
    head.addLast("�̫�@��");
    System.out.println(head);
    //�R���Ĥ@��
    head.remove(head.getFirst());
    System.out.println(head);
    //�A�R���Ĥ@�ӡA�ĥΤU�Ъ��覡�A�U�бq0�}�l
    head.remove(0);
    System.out.println(head);
    head.remove(head.getLast());
    System.out.println(head);
  }
}