

package at.tugraz.iaik.nf4droid.client.service.requestfactory.request;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;

@ServiceName("at.tugraz.iaik.nf4droid.server.domain.model.DroidIcmpPacket")
public interface DroidIcmpPacketRequest extends RequestContext {

    abstract Request<java.lang.Long> countDroidIcmpPackets();

    abstract Request<java.util.List<at.tugraz.iaik.nf4droid.client.service.requestfactory.proxy.DroidIcmpPacketProxy>> findAllDroidIcmpPackets();

    abstract Request<java.util.List<at.tugraz.iaik.nf4droid.client.service.requestfactory.proxy.DroidIcmpPacketProxy>> findDroidIcmpPacketEntries(int firstResult, int maxResults);

    abstract Request<at.tugraz.iaik.nf4droid.client.service.requestfactory.proxy.DroidIcmpPacketProxy> findDroidIcmpPacket(Long id);

    abstract InstanceRequest<at.tugraz.iaik.nf4droid.client.service.requestfactory.proxy.DroidIcmpPacketProxy, java.lang.Void> persist();

    abstract InstanceRequest<at.tugraz.iaik.nf4droid.client.service.requestfactory.proxy.DroidIcmpPacketProxy, java.lang.Void> remove();
}
