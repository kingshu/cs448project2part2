package heap;

import global.GlobalConst;
import global.RID;

import java.io.IOException;

import bufmgr.BufMgrException;
import diskmgr.DiskMgrException;

class Heapfile implements GlobalConst {
	
    // Initialize.  A null name produces a temporary heapfile which will be
    // deleted by the destructor.  If the name already denotes a file, the
    // file is opened; otherwise, a new empty file is created.
    Heapfile(String name) throws BufMgrException, DiskMgrException, IOException {

    }
   
	// Delete the file from the database.
	public void deleteFile() throws BufMgrException, DiskMgrException, IOException {

	}
	
	// Delete record from file with given rid.
	public boolean deleteRecord(RID rid) throws BufMgrException, DiskMgrException, Exception {

		return false;
	}
	
	// Return number of records in file.
	 public int getRecCnt() throws DiskMgrException, BufMgrException, IOException {

		return 0;
	}
	
	// Read record from file, returning pointer and length.
	public Tuple getRecord(RID rid) throws DiskMgrException, BufMgrException, Exception {

		return new Tuple();
	}
	
	/* Insert record into file, return its Rid.
	 * @param recPtr - pointer of the record
	 * @param recLen - the length of the record
	*/
	public RID insertRecord(byte recPtr[], int recLen) throws BufMgrException, DiskMgrException, IOException {

		return new RID();
	}
	
	// Initiate a sequential scan.
	public Scan openScan() throws IOException {

		return new Scan();
	}

	// Updates the specified record in the heapfile.
	public boolean updateRecord(RID rid, Tuple newtuple) throws DiskMgrException, BufMgrException, Exception {

		return false;
	}

}