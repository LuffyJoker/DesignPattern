package mediator;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:26
 * desc：具体的中介者，持有需要协调的所有对象。根据业务逻辑，通过 changed 方法切换到对应的对象上去处理
 */
public class MainBoard extends Mediator {

    private CDDevice cdDevice;
    private CPU cpu;
    private SoundCard soundCard;
    private GraphicsCard graphicsCard;

    @Override
    void changed(Colleague colleague) {
        // 根据业务逻辑，切换到对应的对象上去处理这个问题
        if (colleague == cdDevice) {
            handleCD((CDDevice) colleague);
        } else if (colleague == cpu) {
            handleCPU(cpu);
        }
    }

    public void handleCD(CDDevice cdDevice) {
        cpu.decodeData(cdDevice.read());
    }

    public void handleCPU(CPU cpu) {
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
