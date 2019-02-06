
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResetServer_QNAME = new QName("http://WebService/", "resetServer");
    private final static QName _GameOver_QNAME = new QName("http://WebService/", "gameOver");
    private final static QName _NameCheckResponse_QNAME = new QName("http://WebService/", "nameCheckResponse");
    private final static QName _TurnResponse_QNAME = new QName("http://WebService/", "turnResponse");
    private final static QName _Turn_QNAME = new QName("http://WebService/", "turn");
    private final static QName _ResetServerResponse_QNAME = new QName("http://WebService/", "resetServerResponse");
    private final static QName _NameCheck_QNAME = new QName("http://WebService/", "nameCheck");
    private final static QName _DropPieceResponse_QNAME = new QName("http://WebService/", "dropPieceResponse");
    private final static QName _Join_QNAME = new QName("http://WebService/", "join");
    private final static QName _JoinResponse_QNAME = new QName("http://WebService/", "joinResponse");
    private final static QName _Quit_QNAME = new QName("http://WebService/", "quit");
    private final static QName _UpadteBoard_QNAME = new QName("http://WebService/", "upadteBoard");
    private final static QName _ReadyToStartResponse_QNAME = new QName("http://WebService/", "readyToStartResponse");
    private final static QName _UpadteBoardResponse_QNAME = new QName("http://WebService/", "upadteBoardResponse");
    private final static QName _ReadyToStart_QNAME = new QName("http://WebService/", "readyToStart");
    private final static QName _DropPiece_QNAME = new QName("http://WebService/", "dropPiece");
    private final static QName _GameOverResponse_QNAME = new QName("http://WebService/", "gameOverResponse");
    private final static QName _QuitResponse_QNAME = new QName("http://WebService/", "quitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NameCheck }
     * 
     */
    public NameCheck createNameCheck() {
        return new NameCheck();
    }

    /**
     * Create an instance of {@link ResetServerResponse }
     * 
     */
    public ResetServerResponse createResetServerResponse() {
        return new ResetServerResponse();
    }

    /**
     * Create an instance of {@link Turn }
     * 
     */
    public Turn createTurn() {
        return new Turn();
    }

    /**
     * Create an instance of {@link GameOver }
     * 
     */
    public GameOver createGameOver() {
        return new GameOver();
    }

    /**
     * Create an instance of {@link NameCheckResponse }
     * 
     */
    public NameCheckResponse createNameCheckResponse() {
        return new NameCheckResponse();
    }

    /**
     * Create an instance of {@link TurnResponse }
     * 
     */
    public TurnResponse createTurnResponse() {
        return new TurnResponse();
    }

    /**
     * Create an instance of {@link ResetServer }
     * 
     */
    public ResetServer createResetServer() {
        return new ResetServer();
    }

    /**
     * Create an instance of {@link QuitResponse }
     * 
     */
    public QuitResponse createQuitResponse() {
        return new QuitResponse();
    }

    /**
     * Create an instance of {@link DropPiece }
     * 
     */
    public DropPiece createDropPiece() {
        return new DropPiece();
    }

    /**
     * Create an instance of {@link GameOverResponse }
     * 
     */
    public GameOverResponse createGameOverResponse() {
        return new GameOverResponse();
    }

    /**
     * Create an instance of {@link ReadyToStart }
     * 
     */
    public ReadyToStart createReadyToStart() {
        return new ReadyToStart();
    }

    /**
     * Create an instance of {@link ReadyToStartResponse }
     * 
     */
    public ReadyToStartResponse createReadyToStartResponse() {
        return new ReadyToStartResponse();
    }

    /**
     * Create an instance of {@link UpadteBoardResponse }
     * 
     */
    public UpadteBoardResponse createUpadteBoardResponse() {
        return new UpadteBoardResponse();
    }

    /**
     * Create an instance of {@link Quit }
     * 
     */
    public Quit createQuit() {
        return new Quit();
    }

    /**
     * Create an instance of {@link UpadteBoard }
     * 
     */
    public UpadteBoard createUpadteBoard() {
        return new UpadteBoard();
    }

    /**
     * Create an instance of {@link Join }
     * 
     */
    public Join createJoin() {
        return new Join();
    }

    /**
     * Create an instance of {@link JoinResponse }
     * 
     */
    public JoinResponse createJoinResponse() {
        return new JoinResponse();
    }

    /**
     * Create an instance of {@link DropPieceResponse }
     * 
     */
    public DropPieceResponse createDropPieceResponse() {
        return new DropPieceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "resetServer")
    public JAXBElement<ResetServer> createResetServer(ResetServer value) {
        return new JAXBElement<ResetServer>(_ResetServer_QNAME, ResetServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GameOver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "gameOver")
    public JAXBElement<GameOver> createGameOver(GameOver value) {
        return new JAXBElement<GameOver>(_GameOver_QNAME, GameOver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "nameCheckResponse")
    public JAXBElement<NameCheckResponse> createNameCheckResponse(NameCheckResponse value) {
        return new JAXBElement<NameCheckResponse>(_NameCheckResponse_QNAME, NameCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "turnResponse")
    public JAXBElement<TurnResponse> createTurnResponse(TurnResponse value) {
        return new JAXBElement<TurnResponse>(_TurnResponse_QNAME, TurnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Turn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "turn")
    public JAXBElement<Turn> createTurn(Turn value) {
        return new JAXBElement<Turn>(_Turn_QNAME, Turn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "resetServerResponse")
    public JAXBElement<ResetServerResponse> createResetServerResponse(ResetServerResponse value) {
        return new JAXBElement<ResetServerResponse>(_ResetServerResponse_QNAME, ResetServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "nameCheck")
    public JAXBElement<NameCheck> createNameCheck(NameCheck value) {
        return new JAXBElement<NameCheck>(_NameCheck_QNAME, NameCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropPieceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "dropPieceResponse")
    public JAXBElement<DropPieceResponse> createDropPieceResponse(DropPieceResponse value) {
        return new JAXBElement<DropPieceResponse>(_DropPieceResponse_QNAME, DropPieceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Join }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "join")
    public JAXBElement<Join> createJoin(Join value) {
        return new JAXBElement<Join>(_Join_QNAME, Join.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JoinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "joinResponse")
    public JAXBElement<JoinResponse> createJoinResponse(JoinResponse value) {
        return new JAXBElement<JoinResponse>(_JoinResponse_QNAME, JoinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "quit")
    public JAXBElement<Quit> createQuit(Quit value) {
        return new JAXBElement<Quit>(_Quit_QNAME, Quit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpadteBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "upadteBoard")
    public JAXBElement<UpadteBoard> createUpadteBoard(UpadteBoard value) {
        return new JAXBElement<UpadteBoard>(_UpadteBoard_QNAME, UpadteBoard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadyToStartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "readyToStartResponse")
    public JAXBElement<ReadyToStartResponse> createReadyToStartResponse(ReadyToStartResponse value) {
        return new JAXBElement<ReadyToStartResponse>(_ReadyToStartResponse_QNAME, ReadyToStartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpadteBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "upadteBoardResponse")
    public JAXBElement<UpadteBoardResponse> createUpadteBoardResponse(UpadteBoardResponse value) {
        return new JAXBElement<UpadteBoardResponse>(_UpadteBoardResponse_QNAME, UpadteBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadyToStart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "readyToStart")
    public JAXBElement<ReadyToStart> createReadyToStart(ReadyToStart value) {
        return new JAXBElement<ReadyToStart>(_ReadyToStart_QNAME, ReadyToStart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropPiece }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "dropPiece")
    public JAXBElement<DropPiece> createDropPiece(DropPiece value) {
        return new JAXBElement<DropPiece>(_DropPiece_QNAME, DropPiece.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GameOverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "gameOverResponse")
    public JAXBElement<GameOverResponse> createGameOverResponse(GameOverResponse value) {
        return new JAXBElement<GameOverResponse>(_GameOverResponse_QNAME, GameOverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "quitResponse")
    public JAXBElement<QuitResponse> createQuitResponse(QuitResponse value) {
        return new JAXBElement<QuitResponse>(_QuitResponse_QNAME, QuitResponse.class, null, value);
    }

}
