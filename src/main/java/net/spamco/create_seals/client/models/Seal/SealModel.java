package net.spamco.create_seals.client.models.Seal;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.spamco.create_seals.CreateSeals;
import net.spamco.create_seals.entity.Seal_entity;

import javax.swing.text.html.parser.Entity;

public class SealModel extends EntityModel<Seal_entity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(CreateSeals.MOD_ID, "sealmodel"), "main");
	private final ModelPart Seal;
	private final ModelPart Train_Cap;

	public SealModel(ModelPart root) {
		this.Seal = root.getChild("Seal");
		this.Train_Cap = root.getChild("Train_Cap");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Seal = partdefinition.addOrReplaceChild("Seal", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Neck = Seal.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offset(0.0F, -5.079F, -11.095F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(34, 33).addBox(-3.0F, -6.0F, -3.6436F, 6.0F, 18.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.9886F, -0.2615F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(31, 16).addBox(-4.0F, -4.5F, -4.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(37, 7).addBox(-3.0F, -0.5F, -8.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.921F, -1.905F));

		PartDefinition Body = Seal.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(12, 58).addBox(-6.5F, -16.0F, -15.0F, 13.0F, 13.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition L_Arm = Body.addOrReplaceChild("L_Arm", CubeListBuilder.create(), PartPose.offset(-7.0F, -4.0F, -12.0F));

		PartDefinition L_Arm_r1 = L_Arm.addOrReplaceChild("L_Arm_r1", CubeListBuilder.create().texOffs(0, 69).addBox(-7.0F, -1.0F, 0.0F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -1.0F, -0.0785F, -0.0436F, -0.3927F));

		PartDefinition L_Flap = L_Arm.addOrReplaceChild("L_Flap", CubeListBuilder.create(), PartPose.offset(7.0F, 4.0F, 10.0F));

		PartDefinition L_Flap_r1 = L_Flap.addOrReplaceChild("L_Flap_r1", CubeListBuilder.create().texOffs(0, 58).addBox(-6.8F, 0.0F, -0.25F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, -2.0F, -11.0F, -0.0873F, 0.0F, -0.1309F));

		PartDefinition R_Arm = Body.addOrReplaceChild("R_Arm", CubeListBuilder.create(), PartPose.offset(7.0F, -4.0F, -12.0F));

		PartDefinition R_Arm_r1 = R_Arm.addOrReplaceChild("R_Arm_r1", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(0.0F, -1.0F, 0.0F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, -0.0785F, 0.0436F, 0.3927F));

		PartDefinition R_Flap = R_Arm.addOrReplaceChild("R_Flap", CubeListBuilder.create(), PartPose.offset(-7.0F, 4.0F, 10.0F));

		PartDefinition R_Flap_r1 = R_Flap.addOrReplaceChild("R_Flap_r1", CubeListBuilder.create().texOffs(0, 58).mirror().addBox(-0.2F, 0.0F, -0.25F, 7.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(13.0F, -2.0F, -11.0F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition Rear = Body.addOrReplaceChild("Rear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Rear_r1 = Rear.addOrReplaceChild("Rear_r1", CubeListBuilder.create().texOffs(23, 93).addBox(-6.0F, -11.0F, -3.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, 8.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Feet = Rear.addOrReplaceChild("Feet", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition L_Foot_r1 = Feet.addOrReplaceChild("L_Foot_r1", CubeListBuilder.create().texOffs(34, 117).addBox(-2.0F, 1.5F, -0.5F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(34, 117).mirror().addBox(-9.0F, 1.5F, -0.5F, 5.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -6.5F, 18.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Train_Cap = partdefinition.addOrReplaceChild("Train_Cap", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Seal_entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Seal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Train_Cap.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}