

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.neuedu.daka.Employee;

public class TestJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JSON(���ݸ�ʽ) �����������ͣ� ���֣��ַ�����boolean(true, false), ����������˫���Ŷ���
		   //1. ���� {"id":1,"name":"feiyy"}
		   //2. ��[{"id":1,"name":"feiyy"},{"id":2,"name":"xx"},{"id":3,"name":"yy"}]
		
		//�ѵ㣺List<Student> <-> Json�ַ���  jar��������Ͱ� fastjson, Google gson....��  
		/*Student s = new Student();
		s.setId(1);
		s.setName("feiyy");
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("xx");
		
		List<Student> list = new ArrayList<>();
		list.add(s);
		list.add(s2);
		
		System.out.println(JSON.toJSONString(list));
		
		String str = "[{\"id\":2,\"name\":\"tom\"},{\"id\":3,\"name\":\"xx\"}]";
		
		//Student s2 = JSON.parseObject(str, Student.class);
		//System.out.println(s2.getId()+"\t"+s2.getName());
		
		List<Student> list2 = JSON.parseArray(str, Student.class);
		
		System.out.println(list2.size());*/
		
		//InputStream ins = new FileInputStream("C:\Users\Administrator\Documents\workspace-sts-3.8.4.RELEASE\JavaSenior\src\emps.data")
		//InputStream in = TestJson.class.getClassLoader().getResourceAsStream("emps.data");//�����src����

        List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(1,"tom"));
		emps.add(new Employee(2,"jack"));
		emps.add(new Employee(3,"jerry"));	
		
		String empstr = JSON.toJSONString(emps);

		File f = new File(TestJson.class.getClassLoader().getResource("emps.data").getPath());//����ڵ�ǰ�ļ� 
		
		try {
			FileWriter w = new FileWriter(f);
			w.write(empstr);
			w.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
