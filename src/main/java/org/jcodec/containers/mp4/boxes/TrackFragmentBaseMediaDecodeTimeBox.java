package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;

/**
 * The Track Fragment Base Media Decode Time Box provides the absolute decode
 * time, measured on the media timeline, of the first sample in decode order in
 * the track fragment. This can be useful, for example, when performing random
 * access in a file; it is not necessary to sum the sample durations of all
 * preceding samples in previous fragments to find this value (where the sample
 * durations are the deltas in the Decoding Time to Sample Box and the
 * sample_durations in the preceding track runs). The Track Fragment Base Media
 * Decode Time Box, if present, shall be positioned after the Track Fragment
 * Header Box and before the first Track Fragment Run box.
 * 
 * @author Jay Codec
 * 
 */
public class TrackFragmentBaseMediaDecodeTimeBox extends FullBox {

    private long baseMediaDecodeTime;

    public TrackFragmentBaseMediaDecodeTimeBox() {
        super(new Header(fourcc()));
    }

    public TrackFragmentBaseMediaDecodeTimeBox(long baseMediaDecodeTime) {
        this();
        this.baseMediaDecodeTime = baseMediaDecodeTime;
    }

    public static String fourcc() {
        return "tfdt";
    }

    @Override
    public void parse(ByteBuffer input) {
        super.parse(input);
        if (version == 0) {
            baseMediaDecodeTime = input.getInt();
        } else if (version == 1) {
            baseMediaDecodeTime = input.getLong();
        } else
            throw new RuntimeException("Unsupported tfdt version");
    }

    @Override
    protected void doWrite(ByteBuffer out) {
        super.doWrite(out);
        if (version == 0) {
            out.putInt((int) baseMediaDecodeTime);
        } else if (version == 1) {
            out.putLong(baseMediaDecodeTime);
        } else
            throw new RuntimeException("Unsupported tfdt version");
    }

    public long getBaseMediaDecodeTime() {
        return baseMediaDecodeTime;
    }

    public static Factory copy(TrackFragmentBaseMediaDecodeTimeBox other) {
        return new Factory(other);
    }

    public static class Factory {
        private TrackFragmentBaseMediaDecodeTimeBox box;

        protected Factory(TrackFragmentBaseMediaDecodeTimeBox other) {
            box = new TrackFragmentBaseMediaDecodeTimeBox(other.baseMediaDecodeTime);
            box.version = other.version;
            box.flags = other.flags;
        }

        public Factory baseMediaDecodeTime(long val) {
            box.baseMediaDecodeTime = val;
            return this;
        }

        public TrackFragmentBaseMediaDecodeTimeBox create() {
            try {
                return box;
            } finally {
                box = null;
            }
        }
    }
}