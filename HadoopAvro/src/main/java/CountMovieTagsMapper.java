import java.io.IOException;

import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericData.Array;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.AvroKey;
import org.apache.avro.mapred.AvroValue;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Mapper;

public class CountMovieTagsMapper extends Mapper<AvroKey<GenericRecord>,NullWritable,AvroKey<String>,AvroValue<Integer>> {

	@Override
	public void map(AvroKey<GenericRecord> key,NullWritable value,Context context) 
			throws IOException,InterruptedException{
		GenericData.Array<String> tags=(Array<String>) key.datum().get("tags");
		for(String tag:tags){
			context.write(new AvroKey<String>(tag), new AvroValue<Integer>(1));
		}

	}
}
