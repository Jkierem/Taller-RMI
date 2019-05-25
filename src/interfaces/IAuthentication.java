package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAuthentication extends Remote {
  boolean attemptLogin( String user , String password ) throws RemoteException;
  int getBalance( String user ) throws RemoteException;
  int attemptChangeBalance( String user , int amount , String token ) throws RemoteException;
  void commitBalanceChange( int tid , String token ) throws RemoteException;
  void abortBalanceChange( int tid , String token ) throws RemoteException;
}
