import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Maptest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RandomAccessFile rf = new RandomAccessFile("test.txt","r");
		FileChannel chan = rf.getChannel();
		MappedByteBuffer mbb = chan.map(FileChannel.MapMode.READ_ONLY, 0, rf.length());
		List<byte[]> list = new ArrayList<>();
		byte[] a = new byte[4];
		
        int t=0;
        int partOne, partTwo, tempNum = 8, curDigit, unFinishNumInBuf=-1;
        for(int i=0;i<rf.length();i++)
        {
        	
        	a[i]=mbb.get(i);
        	
        }
        list.add(a);
       
        byte[] b = new byte[]{1,7,3,9};
        list.add(b);
        Collections.sort(list,new Comparator<byte[]>()
        {
        	public int compare(byte[]x,byte[]z) 
        	{
        		System.out.println(x[0]);
        		System.out.println(z[0]);
        		return x[0] - z[0];
        	}
        });
        
        ListIterator<byte[]> li = list.listIterator();
        while (li.hasNext()) {
        	
            System.out.println(Arrays.toString(li.next()));
        }
        
        String s=Arrays.toString(a);
        System.out.println(s.substring(0,3));
        String h = new String(b,StandardCharsets.UTF_8);
        System.out.println(h);
        File f=new File("new.txt");
        //FileOutputStream out=new FileOutputStream("new.txt");
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
        bw.write(h);
        bw.flush();
        bw.close();
        
        
	}

}


