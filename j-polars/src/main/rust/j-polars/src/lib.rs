
use jni::JNIEnv;
use jni::objects::{JClass, JString};
use jni::sys::jstring;

use polars::prelude::*;


#[no_mangle]
pub extern "C" fn get_data_frame() -> *mut DataFrame {
    TODO!();
}
